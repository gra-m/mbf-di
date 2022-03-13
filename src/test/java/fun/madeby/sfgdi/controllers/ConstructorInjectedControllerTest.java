package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingService;
import fun.madeby.sfgdi.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceEnglish());
    }

    @Test
    void getEnglishGreeting() {
        System.out.println(controller.getGreeting());
    }

}