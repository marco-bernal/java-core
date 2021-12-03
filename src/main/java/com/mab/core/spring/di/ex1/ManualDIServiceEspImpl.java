package com.mab.core.spring.di.ex1;

public class ManualDIServiceEspImpl implements ManualDIService {

    @Override
    public String greet() {
        return "Que hay!";
    }
}
