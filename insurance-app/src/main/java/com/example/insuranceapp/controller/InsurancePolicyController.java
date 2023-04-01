package com.example.insuranceapp.controller;

import com.example.insuranceapp.repository.InsurancePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/policies")
public class InsurancePolicyController {
    @Autowired
    private InsurancePolicyRepository policyrepository;
// implement the necessary APIs
}