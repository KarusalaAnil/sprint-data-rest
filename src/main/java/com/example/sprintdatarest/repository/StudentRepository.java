package com.example.sprintdatarest.repository;

import com.example.sprintdatarest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
