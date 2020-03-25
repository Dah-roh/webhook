package com.example.samplerest.repositories;

import com.example.samplerest.models.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
