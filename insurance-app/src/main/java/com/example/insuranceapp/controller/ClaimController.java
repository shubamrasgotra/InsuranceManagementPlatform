package com.example.insuranceapp.controller;

import com.example.insuranceapp.repository.Claimrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {
    @Autowired
    private Claimrepository claimrepository;
    // implement the necessary APIs
}