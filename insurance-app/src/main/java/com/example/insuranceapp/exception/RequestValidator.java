package com.example.insuranceapp.exception;

import com.example.insuranceapp.entity.Claim;
import com.example.insuranceapp.entity.Client;
import com.example.insuranceapp.entity.InsurancePolicy;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class RequestValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Client.class.equals(clazz) || InsurancePolicy.class.equals(clazz) || Claim.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // implement the necessary validations
    }
}
