package com.mab.core.util;

import com.mab.core.configuration.properties.JsonFileProperties;
import com.mab.core.model.Car;
import com.mab.core.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.mab.core.util.LoadJsonFileUtils.*;

@Component
@RequiredArgsConstructor
public class LoadDataSetsUtils {

    private final JsonFileProperties jsonFileProperties;

    public List<Car> loadCars() {
        return loadCarsFromJsonFile(jsonFileProperties.getCarFileName());
    }

    public List<Person> loadPeople() {
        return loadPeopleFromJsonFile(jsonFileProperties.getPeopleFileName());
    }

    //TODO: Add methods for missing resources
}
