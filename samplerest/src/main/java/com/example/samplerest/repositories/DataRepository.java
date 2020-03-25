package com.example.samplerest.repositories;

import com.example.samplerest.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
