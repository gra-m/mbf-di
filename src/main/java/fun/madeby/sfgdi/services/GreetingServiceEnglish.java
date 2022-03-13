package fun.madeby.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Gra_m
 * on 2022 03 12
 */
@Service
public class GreetingServiceEnglish implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
