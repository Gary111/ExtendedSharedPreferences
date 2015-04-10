package com.extendedsharedpreferences.converter;

import java.io.IOException;
import java.lang.reflect.Type;

public interface Converter {

    Object fromString(String string, Type type) throws IOException;

    String toString(Object object, Type type);

}
