package com.extendedsharedpreferences.converter;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;

public class GsonConverter implements Converter {

    private final Gson gson;

    public GsonConverter() {
        this(new Gson());
    }

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
