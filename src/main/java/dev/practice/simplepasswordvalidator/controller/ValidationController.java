package dev.practice.simplepasswordvalidator.controller;

import dev.practice.simplepasswordvalidator.schemas.PasswordValues;
import dev.practice.simplepasswordvalidator.schemas.ValidationResult;
import dev.practice.simplepasswordvalidator.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ValidationController {

    private final ValidationService validationService;

    @PostMapping(value = "/validate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ValidationResult validatePassword(@RequestBody PasswordValues passwordValues){
        return validationService.validatePassword(passwordValues);
    }
}
