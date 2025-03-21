package com.mab.core.collections.conversion;

import com.mab.core.model.EmployeeDto;
import com.mab.core.test_utils.IntegrationTestBase;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.mab.core.collections.conversion.set.Set2Map.getMapValuesFromSet;
import static org.assertj.core.api.Assertions.assertThat;

class Set2MapTest extends IntegrationTestBase {

    @Test
    void shouldConvertSetToMap() {
     //given
     Set<EmployeeDto> employeeSet = new HashSet<>(loadEmployees());

     //when
     Map<String, String> employeeMap = getMapValuesFromSet(employeeSet);

     //then
     assertThat(employeeMap)
             .isNotEmpty()
             .hasSize(105)
     ;
    }
}
