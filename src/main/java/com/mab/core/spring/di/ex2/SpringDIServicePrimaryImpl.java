package com.mab.core.spring.di.ex2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class SpringDIServicePrimaryImpl implements SpringDIService {

    @Override
    public String greet() {
        return "Hey there from primary bean!";
    }
}
