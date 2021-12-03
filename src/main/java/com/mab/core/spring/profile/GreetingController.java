package com.mab.core.spring.profile;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class GreetingController {

    @NonNull
    @Qualifier("greetingService")
    private final GreetingService greetingService;

    public String greet() {
        return greetingService.greet();
    }
}
