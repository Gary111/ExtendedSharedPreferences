package com.extendedsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.extendedsharedpreferences.converter.Converter;
import com.extendedsharedpreferences.converter.GsonConverter;

import java.lang.reflect.Type;
import java.util.Set;

/**
 * Interface for accessing and modifying preference data exactly like an {@link SharedPreferences},
 * but with additional methods for saving complex objects.
 */
public interface ExtendedSharedPreferences extends SharedPreferences {

    /**
     *
     */
    public static class Builder {

        private final Context applicationContext;

        private String name;
        private int mode;

        private Converter converter;

        /**
         * Constructor using a context for this builder and the {@link ExtendedSharedPreferences}
         * implementation it creates.
         * Default name is "ExtendedSharedPreferences".
         * Default mode is Context.MODE_PRIVATE.
         * Default converter is new GsonConverter().
         */
        public Builder(Context context) {
            if (context == null) {
                throw new NullPointerException("Context can not be null");
            }

            applicationContext = context.getApplicationContext();

            name = ExtendedSharedPreferences.class.getSimpleName();
            mode = Context.MODE_PRIVATE;

            converter = new GsonConverter();
        }

        /**
         * Set preferences file name.
         * @param name Desired preferences file. If a preferences file by this name does not exist,
         *             it will be created when you retrieve an editor
         *             {@link ExtendedSharedPreferences#edit()} and then commit changes
         *             {@link ExtendedEditor#commit()}.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Set preferences file mode.
         * @param mode Operating mode. Use 0 or {@link Context#MODE_PRIVATE} for the default
         *             operation, {@link Context#MODE_WORLD_READABLE} and
         *             {@link Context#MODE_WORLD_WRITEABLE} to control permissions.
         */
        public Builder setMode(int mode) {
            this.mode = mode;
            return this;
        }

        /**
         * The converter used for converting from and to String representation of objects.
         */
        public Builder setConverter(Converter converter) {
            this.converter = converter;
            return this;
        }

        /**
         * Cretae new ExtendedSharedPreferences implementation instance.
         * @return ExtendedSharedPreferences implementation.
         */
        public ExtendedSharedPreferences build() {
            return new ExtendedSharedPreferencesImpl(applicationContext, name, mode, converter);
        }
    }

    /**
     * Interface used for modifying values in a {@link SharedPreferences} object. It's like an
     * {@link Editor} with additional methods for complex objects.
     */
    public interface ExtendedEditor extends Editor {

        ExtendedEditor putString(String key, String value);

        ExtendedEditor putStringSet(String key, Set<String> values);

        ExtendedEditor putInt(String key, int value);

        ExtendedEditor putLong(String key, long value);

        ExtendedEditor putFloat(String key, float value);

        ExtendedEditor putBoolean(String key, boolean value);

        ExtendedEditor remove(String key);

        ExtendedEditor clear();

        /**
         * Set a String representation of Object value in the preferences editor, to be written back
         * once {@link #commit} or {@link #apply} are called.
         * @param key The name of the preference to modify.
         * @param type Target object type.
         * @param value The new value for the preference. Supplying {@code null} as the value is
         *              equivalent to calling {@link #remove(String)} with this key.
         * @return Returns a reference to the same Editor object, so you can chain put calls
         * together.
         */
        <T> ExtendedEditor putObject(String key, Type type, T value);

        /**
         * Set a String representation of Object value in the preferences editor, to be written back
         * once {@link #commit} or {@link #apply} are called.
         * @param key The name of the preference to modify.
         * @param type Target object type.
         * @param value The new value for the preference. Supplying {@code null} as the value is
         *              equivalent to calling {@link #remove(String)} with this key.
         * @return Returns a reference to the same Editor object, so you can chain put calls
         * together.
         */
        <T> ExtendedEditor putObject(String key, Class<T> type, T value);

    }

    ExtendedEditor edit();

    /**
     * Retrieve a <T> value from the preferences.
     * @param key The name of the preference to retrieve.
     * @param type Target object type.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws ClassCastException if
     * there is a preference with this name that is not a String.
     * @throws ClassCastException.
     */
    <T> T getObject(String key, Type type, T defValue);

    /**
     * Retrieve a <T> value from the preferences.
     * @param key The name of the preference to retrieve.
     * @param type Target object type.
     * @param defValue Value to return if this preference does not exist.
     * @return Returns the preference value if it exists, or defValue. Throws ClassCastException if
     * there is a preference with this name that is not a String.
     * @throws ClassCastException.
     */
    <T> T getObject(String key, Class<T> type, T defValue);

}
