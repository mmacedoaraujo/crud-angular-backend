package com.mmacedo.crudspring.controller;

import com.mmacedo.crudspring.model.Course;
import com.mmacedo.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity<List<Course>> listAll() {
        List<Course> allCourses = courseRepository.findAll();

        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }
}
