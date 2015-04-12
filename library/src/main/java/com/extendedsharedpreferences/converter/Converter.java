package com.extendedsharedpreferences.converter;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Interface for converting objects from and to their String representation.
 */
public interface Converter {

    /**
     * Convert a String object representation to a concrete object of the specified type.
     *
     * @param string Object representation.
     * @param type Target object type.
     * @return Instance of {@code type} which will be cast by the caller
     * @throws IOException
     */
    Object fromString(String string, Type type) throws IOException;

    /**
     * Convert an object to a String object representation.
     *
     * @param object Object instance to convert.
     * @param type Target object type.
     * @return Representation of the specified object as String.
     */
    String toString(Object object, Type type);

}
