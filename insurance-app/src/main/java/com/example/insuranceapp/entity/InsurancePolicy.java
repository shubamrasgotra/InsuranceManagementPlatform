package com.example.insuranceapp.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity

public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyNumber;
    private String Type;
    private double coverageAmount;
    private double premium;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @OneToMany(mappedBy = "policy", cascade = CascadeType.ALL)
    private List<Claim> claims = new ArrayList<>();
    // getters and setters
}
