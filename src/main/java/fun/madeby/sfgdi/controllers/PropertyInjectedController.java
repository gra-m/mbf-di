package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingService;
import fun.madeby.sfgdi.services.GreetingServiceEnglish;

/**
 * Created by Gra_m
 * on 2022 03 12
 */

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
