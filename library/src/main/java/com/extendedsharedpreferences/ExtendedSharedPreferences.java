package com.extendedsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.extendedsharedpreferences.converter.Converter;
import com.extendedsharedpreferences.converter.GsonConverter;

import java.lang.reflect.Type;
import java.util.Set;

public interface ExtendedSharedPreferences extends SharedPreferences {

    public static class Builder {

        private final Context applicationContext;

        private String name;
        private int mode;

        private Converter converter;

        public Builder(Context context) {
            if (context == null) {
                throw new NullPointerException("Context can not be null");
            }

            applicationContext = context.getApplicationContext();

            name = ExtendedSharedPreferences.class.getSimpleName();
            mode = Context.MODE_PRIVATE;

            converter = new GsonConverter();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMode(int mode) {
            this.mode = mode;
            return this;
        }

        public Builder setConverter(Converter converter) {
            this.converter = converter;
            return this;
        }

        public ExtendedSharedPreferences build() {
            return new ExtendedSharedPreferencesImpl(applicationContext, name, mode, converter);
        }
    }

    public interface ExtendedEditor extends Editor {

        ExtendedEditor putString(String key, String value);

        ExtendedEditor putStringSet(String key, Set<String> values);

        ExtendedEditor putInt(String key, int value);

        ExtendedEditor putLong(String key, long value);

        ExtendedEditor putFloat(String key, float value);

        ExtendedEditor putBoolean(String key, boolean value);

        ExtendedEditor remove(String key);

        ExtendedEditor clear();

        <T> ExtendedEditor putObject(String key, Type type, T value);

        <T> ExtendedEditor putObject(String key, Class<T> type, T value);

    }

    ExtendedEditor edit();

    <T> T getObject(String key, Type type, T defValue);

    <T> T getObject(String key, Class<T> type, T defValue);

}
