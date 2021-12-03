package com.mab.core.spring.di.ex2;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//TODO: Add Integration tests with mockMvc and mockito
@Controller
@AllArgsConstructor
public class SpringDIController {

    //inject both services: esp and eng with Qualifier and Lombok AllArgsConstructor
    @NonNull
    @Qualifier("springDIServiceEngImpl")
    private final SpringDIService engService;

    @NonNull
    @Qualifier("springDIServiceEspImpl")
    private final SpringDIService espService;

    // Inject service without Qualifier because it's marked as a primary bean
    private final SpringDIService primaryService;

    public String spanishGreeting() {
        return espService.greet();
    }

    public String englishGreeting() {
        return engService.greet();
    }

    public String primaryGreeting() {
        return primaryService.greet();
    }
}
