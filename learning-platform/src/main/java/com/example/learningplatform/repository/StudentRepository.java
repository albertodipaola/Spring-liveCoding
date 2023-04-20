package com.example.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningplatform.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
