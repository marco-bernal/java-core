package com.mab.core.test_utils;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mab.core.configuration.JacksonConfig;
import com.mab.core.exception.ResourceLoadException;
import com.mab.core.model.CarDto;
import com.mab.core.model.EmployeeDto;
import com.mab.core.model.JacksonTestDto;
import com.mab.core.model.NbaPlayerDto;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
//            ObjectMapper mapper = new ObjectMapper();
//            return mapper.readValue(getFile(fileName), new TypeReference<>() {}); //FIXME: Make it reusable.
//        } catch (IOException e) {
//            throw new ResourceLoadException(format("Failed to load json file: %1$s", fileName), e);
//        }
//    }

    public static List<CarDto> loadCarsFromJsonFile(String carsFileName) {
        try {
            return new JacksonConfig().objectMapper().readValue(getFile(carsFileName), new TypeReference<>() {});
        } catch (IOException e) {
            throw new ResourceLoadException("Failed to load cars json file.", e);
        }
    }

    public static List<EmployeeDto> loadEmployeesFromJsonFile(String employeesFileName) {
        try {
            return new JacksonConfig().objectMapper().readValue(getFile(employeesFileName), new TypeReference<>() {});
        } catch (IOException e) {
            throw new ResourceLoadException("Failed to load employees json file.", e);
        }
    }

    public static List<NbaPlayerDto> loadNbaPlayersFromJsonFile(String nbaPlayersFileName) {
        try {
            return new JacksonConfig().objectMapper().readValue(getFile(nbaPlayersFileName), new TypeReference<>() {});
        } catch (IOException e) {
            throw new ResourceLoadException("Failed to load NBA players json file.", e);
        }
    }

    public static List<JacksonTestDto> loadJacksonTestsFromJsonFile(String jacksonTestsFileName) {
        try {
            return new JacksonConfig().objectMapper().readValue(getFile(jacksonTestsFileName), new TypeReference<>() {});
        } catch (IOException e) {
            throw new ResourceLoadException("Failed to load tests json file.", e);
        }
    }

    private InputStream getFile(String fileName) {
        return LoadJsonFileUtils.class.getResourceAsStream(fileName);
    }
}
