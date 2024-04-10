package com.example.travelapp.dao;

import com.example.travelapp.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
