package dev.practice.simplepasswordvalidator.service;

import dev.practice.simplepasswordvalidator.schemas.PasswordValues;
import dev.practice.simplepasswordvalidator.schemas.ValidationResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationService {

    private final ValidationResult validationResult;

    private final String regex = "^([^ ])(.{3,})([^ ])$";

    public ValidationResult validatePassword(PasswordValues passwordValues){
        String password = passwordValues.getPassword();
        boolean containsSpecialChars = password.contains("!") || password.contains("$") || password.contains("@") || password.contains("#");
        if (password.matches(regex) && containsSpecialChars){
            validationResult.setValid(true);
        } else {
            validationResult.setValid(false);
        }
        return validationResult;
    }

}
