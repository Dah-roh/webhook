package com.example.samplerest.repositories;

import com.example.samplerest.models.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorizationRepository extends JpaRepository<Authorization, Long> {
}
