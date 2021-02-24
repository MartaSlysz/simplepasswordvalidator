package dev.practice.simplepasswordvalidator.controller;

import dev.practice.simplepasswordvalidator.schemas.PasswordValues;
import dev.practice.simplepasswordvalidator.schemas.ValidationResult;
import dev.practice.simplepasswordvalidator.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ValidationController {

    private final ValidationService validationService;

    @PostMapping(value = "/validate", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public ValidationResult validatePassword(@RequestBody PasswordValues passwordValues){
        return validationService.validatePassword(passwordValues);
    }
}
