package com.example.insuranceapp.repository;

import com.example.insuranceapp.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Claimrepository extends JpaRepository<Claim, Long> {
}
