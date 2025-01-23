package com.mab.core.streams;

import com.mab.core.model.Person;
import com.mab.core.util.LoadDataSetsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class IteratingIntStream {

    private final LoadDataSetsUtils loadDataSetsUtils;

    public List<Person> loadFemales() {
        return loadDataSetsUtils.loadPeople().stream()
                .filter(p-> p.gender().equals("Female"))
                .filter(p-> p.age() < 30)
                .toList();
    }
}
