package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Gra_m
 * on 2022 03 12
 */
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;


    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
