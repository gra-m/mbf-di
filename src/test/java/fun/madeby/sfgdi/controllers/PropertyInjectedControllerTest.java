package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceEnglish();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}