package com.example.insuranceapp.entity;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;

@Entity
public class Client {
    @Id
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String Address;
    private String contactInfo;
    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    private List<InsurancePolicy> policies = new ArrayList<>();
    //getters and setters
}
