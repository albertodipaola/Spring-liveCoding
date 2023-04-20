package com.example.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningplatform.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
