package com.example.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningplatform.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{
    
}
