package com.mab.core.test_utils;

import com.mab.core.configuration.properties.JsonFileProperties;
import com.mab.core.model.Car;
import com.mab.core.model.EmployeeDto;
import com.mab.core.model.JacksonTestDto;
import com.mab.core.model.NbaPlayerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.mab.core.test_utils.LoadJsonFileUtils.*;
import static com.mab.core.test_utils.LoadJsonFileUtils.loadNbaPlayersFromJsonFile;

@IntegrationTestBaseConfig
public abstract class IntegrationTestBase {

    @Autowired
    private JsonFileProperties jsonFileProperties;

    public List<Car> loadCars() {
        return loadCarsFromJsonFile(jsonFileProperties.getCarsFileName());
    }

    public List<EmployeeDto> loadEmployees() {
        return loadEmployeesFromJsonFile(jsonFileProperties.getEmployeesFileName());
    }

    public List<NbaPlayerDto> loadNbaPlayers() {
        return loadNbaPlayersFromJsonFile(jsonFileProperties.getNbaPlayersFileName());
    }
    public List<JacksonTestDto> loadTestDates() {
        return loadJacksonTestsFromJsonFile(jsonFileProperties.getJacksonTestsFileName());
    }

    //TODO: Add generic method (once it works) as private one from LoadJsonFileUtils and remove that class.
}
