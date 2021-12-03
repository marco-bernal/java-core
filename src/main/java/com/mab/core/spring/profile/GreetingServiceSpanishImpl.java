package com.mab.core.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("greetingService")
public class GreetingServiceSpanishImpl implements GreetingService {

    @Override
    public String greet() {
        return "Que onda!";
    }
}
