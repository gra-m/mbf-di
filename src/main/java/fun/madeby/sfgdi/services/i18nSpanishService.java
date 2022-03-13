package fun.madeby.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Gra_m
 * on 2022 03 12
 */
@Profile("ES")
@Service("i18nService")
public class i18nSpanishService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
