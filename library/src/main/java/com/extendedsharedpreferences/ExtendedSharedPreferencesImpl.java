package com.extendedsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.extendedsharedpreferences.converter.Converter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

class ExtendedSharedPreferencesImpl implements ExtendedSharedPreferences {

    private final SharedPreferences sharedPreferences;

    private Converter converter;

    ExtendedSharedPreferencesImpl(Context context, String name, int mode, Converter converter) {
        sharedPreferences = context.getSharedPreferences(name, mode);

        this.converter = converter;
    }

    @Override
    public Map<String, ?> getAll() {
        return sharedPreferences.getAll();
    }

    @Override
    public String getString(String key, String defValue) {
        return sharedPreferences.getString(key, defValue);
    }

    @Override
    public Set<String> getStringSet(String key, Set<String> defValues) {
        return sharedPreferences.getStringSet(key, defValues);
    }

    @Override
    public int getInt(String key, int defValue) {
        return sharedPreferences.getInt(key, defValue);
    }

    @Override
    public long getLong(String key, long defValue) {
        return sharedPreferences.getLong(key, defValue);
    }

    @Override
    public float getFloat(String key, float defValue) {
        return sharedPreferences.getFloat(key, defValue);
    }

    @Override
    public boolean getBoolean(String key, boolean defValue) {
        return sharedPreferences.getBoolean(key, defValue);
    }

    @Override
    public boolean contains(String key) {
        return sharedPreferences.contains(key);
    }

    @Override
    public ExtendedEditor edit() {
        return new ExtendedEditorImpl();
    }

    @Override
    public <T> T getObject(String key, Type type, T defValue) {
        if (contains(key)) {
            try {
                return (T) converter.fromString(getString(key, null), type);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return defValue;
    }

    @Override
    public <T> T getObject(String key, Class<T> type, T defValue) {
        if (contains(key)) {
            try {
                return (T) converter.fromString(getString(key, null), type);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return defValue;
    }

    @Override
    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
        sharedPreferences.registerOnSharedPreferenceChangeListener(listener);
    }

    @Override
    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(listener);
    }

    private final class ExtendedEditorImpl implements ExtendedEditor {

        private final Editor editor;

        private ExtendedEditorImpl() {
            editor = sharedPreferences.edit();
        }

        @Override
        public ExtendedEditor putString(String key, String value) {
            editor.putString(key, value);
            return this;
        }

        @Override
        public ExtendedEditor putStringSet(String key, Set<String> values) {
            editor.putStringSet(key, values);
            return this;
        }

        @Override
        public ExtendedEditor putInt(String key, int value) {
            editor.putInt(key, value);
            return this;
        }

        @Override
        public ExtendedEditor putLong(String key, long value) {
            editor.putLong(key, value);
            return this;
        }

        @Override
        public ExtendedEditor putFloat(String key, float value) {
            editor.putFloat(key, value);
            return this;
        }

        @Override
        public ExtendedEditor putBoolean(String key, boolean value) {
            editor.putBoolean(key, value);
            return this;
        }

        @Override
        public ExtendedEditor remove(String key) {
            editor.remove(key);
            return this;
        }

        @Override
        public ExtendedEditor clear() {
            editor.clear();
            return this;
        }

        @Override
        public <T> ExtendedEditor putObject(String key, Type type, T value) {
            editor.putString(key, converter.toString(value, type));
            return this;
        }

        @Override
        public <T> ExtendedEditor putObject(String key, Class<T> type, T value) {
            editor.putString(key, converter.toString(value, type));
            return this;
        }

        @Override
        public boolean commit() {
            return editor.commit();
        }

        @Override
        public void apply() {
            editor.apply();
        }
    }
}
