package com.mab.core.spring.di.ex2;

import org.springframework.stereotype.Service;

@Service
public class SpringDIServiceEngImpl implements SpringDIService {

    @Override
    public String greet() {
        return "What up bruh!";
    }
}
