package fun.madeby.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Gra_m
 * on 2022 03 13
 */
@Service
public class GreetingServiceFrench implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Bonjour le monde";

    }
}
