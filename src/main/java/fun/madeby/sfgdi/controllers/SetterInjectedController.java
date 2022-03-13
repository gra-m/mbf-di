package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingService;

/**
 * Created by Gra_m
 * on 2022 03 12
 */

public class SetterInjectedController {
    private GreetingService greetingService;


    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
