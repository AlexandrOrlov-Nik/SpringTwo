package app.config;

import app.model.Animal;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    public Dog dog() {
        return new Dog();
    }


    @Bean
    public Animal animal() {
        return dog();  // Возвращаем Dog как Animal
    }
    @Bean
    public Timer timer() {
        return new Timer();
    }
}
