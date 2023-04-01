package com.example.insuranceapp.repository;

import com.example.insuranceapp.entity.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
}
