package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Gra_m
 * on 2022 03 13
 */

@Controller
public class AdditionalController {
    private final GreetingService GREETING_SERVICE;

    public AdditionalController(GreetingService greetingService) {
        this.GREETING_SERVICE = greetingService;
    }

    public String getGreeting() {
        return GREETING_SERVICE.sayGreeting();
    }


}
