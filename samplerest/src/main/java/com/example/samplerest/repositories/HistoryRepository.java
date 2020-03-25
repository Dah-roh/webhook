package com.example.samplerest.repositories;

import com.example.samplerest.models.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}
