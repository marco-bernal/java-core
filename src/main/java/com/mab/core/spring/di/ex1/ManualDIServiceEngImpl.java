package com.mab.core.spring.di.ex1;

public class ManualDIServiceEngImpl implements ManualDIService {

    @Override
    public String greet() {
        return "Sup bro!";
    }
}
