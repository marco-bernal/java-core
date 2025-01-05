package com.mab.core.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mab.core.model.Car;
import com.mab.core.model.Person;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@UtilityClass
public class StreamUtils {

    //TODO; Replace these functions with a generic implementation. Throw custom or different exception.
    public static List<Person> loadPeople() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream peopleIs = getFile("/people.json");
            return mapper.readValue(peopleIs, new TypeReference<>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to load people file.");
        }
    }

    public static List<Car> loadCars() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream carsIs = getFile("/cars.json");
            return mapper.readValue(carsIs, new TypeReference<>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to load cars file.");
        }
    }

    private InputStream getFile(String fileName) {
        return StreamUtils.class.getResourceAsStream(fileName);
    }
}
