package com.mab.core.java.collections.conversion;

import com.mab.core.model.VdpsdkAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//TODO: Delete spring stereotype, add unit tests, and change the model to employee, student, cart, or any other thing
// except vdpsdk

@Component
public class Set2Map {

    public Map<Integer, String> getMapValuesFromSet(Set<VdpsdkAlgorithm> values) {
        return values.stream()
                .collect(Collectors.toMap(
                        VdpsdkAlgorithm::getCode,
                        VdpsdkAlgorithm::getName
                ));
    }

}
