package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.HelloWorld;

@Configuration
public class AppConfig {

    @Bean
    HelloWorld helloWorld(){
        return new HelloWorld();
    }

}