package fun.madeby.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Gra_m
 * on 2022 03 12
 */

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");
        return "Hi Folks";
    }

}
