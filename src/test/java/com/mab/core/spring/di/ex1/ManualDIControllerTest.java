package com.mab.core.spring.di.ex1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ManualDIControllerTest {

    private ManualDIController manualDIController;

    @Test
    void shouldGreetInSpanishInjectingTheEspImpl() {
        //given: Manual DI of the spanish greeting. The spring IoC container does it automatically.
        manualDIController = new ManualDIController(new ManualDIServiceEspImpl());

        //when
        String spanishGreeting = manualDIController.getGreeting();

        //then
        assertThat(spanishGreeting).isEqualTo("Que hay!");
    }

    @Test
    void shouldGreetInEnglishInjectingTheEngImpl() {
        //given: manual DI of the english greeting. The spring IoC container does it automatically.
        manualDIController = new ManualDIController(new ManualDIServiceEngImpl());

        //when
        String englishGreeting = manualDIController.getGreeting();

        //then
        assertThat(englishGreeting).isEqualTo("Sup bro!");
    }

}