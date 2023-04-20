package com.example.learningplatform.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learningplatform.dto.CourseDTO;
import com.example.learningplatform.dto.CreateCourseDTO;
import com.example.learningplatform.dto.UpdateCourseDTO;
import com.example.learningplatform.model.Course;
import com.example.learningplatform.repository.CourseRepository;

@Service("courseService")
public class CourseService implements CrudService<CourseDTO, CreateCourseDTO, UpdateCourseDTO, Long>{
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<CourseDTO> readAll() {
        List<CourseDTO> dtos = new ArrayList<>();
        for (Course course : courseRepository.findAll()) {
            dtos.add(mapper.map(course, CourseDTO.class));
        }
        return dtos;
    }

    @Override
    public CourseDTO readOne(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOne'");
    }

    @Override
    public CourseDTO read(Map<String, String> params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public CourseDTO create(CreateCourseDTO createDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CourseDTO update(UpdateCourseDTO updateDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public CourseDTO delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
