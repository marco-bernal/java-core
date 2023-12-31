package com.mab.core.java.streams;

import com.mab.core.model.Patient;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Using static methods, anyway. It's recommended to avoid them because are harder to test.
 * TODO: Verify above statement
 */

//TODO: Add unit tests, and change the model to something else than Patient

class StreamFilterExample {

    private StreamFilterExample() {
        throw new IllegalStateException("Private class");
    }

    public static Set<Patient> filterPatientsByDiagnosis(Set<Patient> patients, String filter) {
        return patients.stream()
                .filter(p -> p.getDiagnosis().equals(filter))
                .collect(toSet());
    }

    public static Set<Patient> filterPatientsByDiagnosisNotAdenocarcinoma(Set<Patient> patients) {
        return patients.stream()
                .filter(p -> !"Adenocarcinoma".equals(p.getDiagnosis()))
                .collect(toSet());
    }

    public static List<Patient> filterPatientsById(List<Patient> patients) {
        return patients.stream()
                .filter(p -> p.getPatientId() > 3500)
                .collect(toList());
    }
}
