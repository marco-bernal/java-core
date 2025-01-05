package com.mab.core.streams;

import com.mab.core.model.Patient;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;


//TODO: Add unit tests. Replace Patient with Customer or something else

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
