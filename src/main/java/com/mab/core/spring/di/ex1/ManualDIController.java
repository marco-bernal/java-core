package com.mab.core.spring.di.ex1;

class ManualDIController {

    private final ManualDIService manualDIService;

    // Manual DI by constructor
    ManualDIController(ManualDIService manualDIService) {
        this.manualDIService = manualDIService;
    }

    String getGreeting() {
        return manualDIService.greet();
    }
}
