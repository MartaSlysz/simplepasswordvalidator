package dev.practice.simplepasswordvalidator;

import dev.practice.simplepasswordvalidator.schemas.ValidationResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimplepasswordvalidatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplepasswordvalidatorApplication.class, args);
    }

    @Bean
    public ValidationResult validationResultBean(){
        return new ValidationResult();
    }

}
