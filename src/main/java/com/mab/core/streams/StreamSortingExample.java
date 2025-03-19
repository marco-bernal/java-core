package com.mab.core.streams;

import com.mab.core.model.NbaPlayerDto;
import java.util.List;

import static java.util.Comparator.comparing;

public class StreamSortingExample {
//TODO: Remove garbage code.

//    /**
//     * Sorting String using stream().sorted() and String.compareTo. Not Recommended
//     */
//    public List<Patient> sortByTumorTypeStream(List<Patient> patients) {
//        return patients.stream()
//                .sorted((p1, p2) -> p1.getTumorType().compareTo(p2.getTumorType()))
//                .collect(toList());
//    }
//
//    /**
//     * Sorting String using List.sort() and String.compareTo. Not Recommended (manual way)
//     */
//    public List<Patient> sortByTumorTypeSort(List<Patient> patients) {
//        patients.sort((p1, p2) -> p1.getTumorType().compareTo(p2.getTumorType()));
//        return patients;
//    }
//
//    /**
//     * Recommended
//     * Sorting Integer using stream().sort(Comparator.comparing()) and method reference
//     */
//    public List<Patient> sortByIdComparing(List<Patient> patients) {
//        patients.sort(comparingInt(Patient::getPatientId));
//        return patients;
//    }
//
//    /**
//     * Recommended
//     * Sorting String using stream().sort(Comparator.comparing()) and method reference reversed
//     */
//    public List<Patient> sortByTumorTypeComparingReversed(List<Patient> patients) {
//        patients.sort(comparing(Patient::getTumorType).reversed());
//        return patients;
//    }

    /**
     * TODO: Double check whether this is true:
     * Recommended
     * Sorting String using stream().sorted() and String.compareTo.
     */
    public List<NbaPlayerDto> sortByHigherSalaryAndAgeGreaterThan30(List<NbaPlayerDto> players) {
        return players.stream()
                .filter(p -> p.age() >= 30)
                .sorted(comparing(NbaPlayerDto::salary).reversed())
                .toList();
    }

    //TODO: Add more complex examples. Add Tests.
//    /**
//     * Sorting Integers using List.sort(naturalOrder())
//     */
//    public List<Integer> sortByIdSort(List<Integer> numbers) {
//        numbers.sort(naturalOrder());
//        return numbers;
//    }
}
