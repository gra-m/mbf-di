package fun.madeby.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Gra_m
 * on 2022 03 13
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "I implement Greeting Service but am annotated @Primary, hello.";
    }
}
