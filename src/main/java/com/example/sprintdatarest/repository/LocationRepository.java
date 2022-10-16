package com.example.sprintdatarest.repository;

import com.example.sprintdatarest.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
