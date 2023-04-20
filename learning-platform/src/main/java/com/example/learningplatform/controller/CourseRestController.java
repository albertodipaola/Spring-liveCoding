package com.example.learningplatform.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningplatform.dto.CourseDTO;
import com.example.learningplatform.dto.CreateCourseDTO;
import com.example.learningplatform.dto.UpdateCourseDTO;
import com.example.learningplatform.service.CourseService;
import com.example.learningplatform.service.CrudService;

@RestController
@RequestMapping("api/courses")
public class CourseRestController {
    @Autowired
    @Qualifier("courseService")
    private CrudService<CourseDTO, CreateCourseDTO, UpdateCourseDTO, Long> courseService;

    @Autowired
    private CourseService courseServiceImpl;

    @GetMapping
    public List<CourseDTO> get(@RequestParam Map<String, String> params) {
        return courseService.readAll();
    }
}
