package fun.madeby.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Gra_m
 * on 2022 03 13
 */
@Service
public class GreetingServiceGerman implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt";
    }
}
