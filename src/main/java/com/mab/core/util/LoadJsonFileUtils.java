package com.mab.core.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mab.core.exception.ResourceLoadException;
import com.mab.core.model.Car;
import com.mab.core.model.Person;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static java.lang.String.format;

@UtilityClass
public class LoadJsonFileUtils {

    /*
     * Supposedly returning a list of a generic type is not possible, without having the cast issue. SMH
     * https://github.com/FasterXML/jackson-databind/issues/3129
     *
     * Error:
     *  class java.util.LinkedHashMap cannot be cast to class com.mab.core.model.Car
     *  (java.util.LinkedHashMap is in module java.base of loader 'bootstrap'; com.mab.core.model.Car
     *  is in unnamed module of loader 'app').
     *
     * It serializes into the generic list, but when performing Collect stream operations fails.
     *
     * TODO: Learn more about generics and come back to this.
     */
//    public static <T> List<T> loadJsonFile(String fileName) {
//        try {
//            ObjectMapper mapper = new ObjectMapper(); //FIXME: Make it reusable.
//            return mapper.readValue(getFile(fileName), new TypeReference<>() {});
//        } catch (IOException e) {
//            throw new ResourceLoadException(format("Failed to load json file: %1$s", fileName), e);
//        }
//    }

    public static List<Car> loadCarsFromJsonFile(String carsFileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(getFile(carsFileName), new TypeReference<>() {});
        } catch (IOException e) {
            throw new ResourceLoadException("Failed to load cars json file.", e);
        }
    }

    public static List<Person> loadPeopleFromJsonFile(String peopleFileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(getFile(peopleFileName), new TypeReference<>() {});
        } catch (IOException e) {
            throw new ResourceLoadException("Failed to load people json file.", e);
        }
    }

    //TODO: Add methods for missing resources

    private InputStream getFile(String fileName) {
        return LoadJsonFileUtils.class.getResourceAsStream(fileName);
    }
}
