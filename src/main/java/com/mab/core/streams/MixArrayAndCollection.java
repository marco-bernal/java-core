package com.mab.core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Stream.of;

//TODO: Add unit tests. Replace Tumor with Customer or something else
public class MixArrayAndCollection {

    /**
     * Requirement: Retrieve all values that match in TUMORS from another sources except Non tumor
     *
     * @return
     */
    private static final String TUMORS = "metastasis-colon-lung-non tumor-brain";

    public List<String> getTumors() {

        String[] baseTumors = getTumorTypes(TUMORS);
        Set<String> anotherSourceTumorsClean = getTumorsFromAnotherSource()
                .stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .collect(toSet());

        return Arrays.stream(baseTumors)
                .map(String::trim)
                .filter(tumor -> !"non tumor".equals(tumor))
                .filter(anotherSourceTumorsClean::contains)
                .collect(toList());
    }

    private String[] getTumorTypes(String tumors) {
        return tumors.split(" \\+|\\*|-");
    }

    private Set<String> getTumorsFromAnotherSource() {
        return of("Non Tumor", "Metastasis", "Brain", "Colon", "Lung", "Breast", "Prostate", "Ovary", "Pancreas").collect(toSet());
    }
}
