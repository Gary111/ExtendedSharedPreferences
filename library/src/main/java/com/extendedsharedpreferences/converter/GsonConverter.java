package com.extendedsharedpreferences.converter;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * A {@link Converter} which uses GSON for serialization and deserialization of entities.
 */
public class GsonConverter implements Converter {

    private final Gson gson;

    /**
     * Create an instance using a default {@link Gson} instance for conversion.
     */
    public GsonConverter() {
        this(new Gson());
    }

    /**
     * Create an instance using the supplied {@link Gson} object for conversion.
     */
    public GsonConverter(Gson gson) {
        this.gson = gson;
    }

    @Override
    public Object fromString(String string, Type type) throws IOException {
        return gson.fromJson(string, type);
    }

    @Override
    public String toString(Object object, Type type) {
        return gson.toJson(object, type);
    }
}
