package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Gra_m
 * on 2022 03 12
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService GREETING_SERVICE;

    public ConstructorInjectedController(@Qualifier("greetingServiceFrench") GreetingService greetingService) {
        this.GREETING_SERVICE = greetingService;
    }

    public String getGreeting() {
       return GREETING_SERVICE.sayGreeting();
    }

}
