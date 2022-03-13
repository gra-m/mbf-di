package fun.madeby.sfgdi.controllers;

import fun.madeby.sfgdi.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceEnglish());
    }

    @Test
    void getGreeting() {
       System.out.println(controller.getGreeting());
    }



}