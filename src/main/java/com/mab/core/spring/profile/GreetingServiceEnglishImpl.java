package com.mab.core.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("greetingService")
public class GreetingServiceEnglishImpl implements GreetingService {

    @Override
    public String greet() {
        return "Hey there!";
    }
}
