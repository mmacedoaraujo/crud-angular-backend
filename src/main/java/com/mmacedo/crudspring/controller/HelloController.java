package com.mmacedo.crudspring.controller;

import com.mmacedo.crudspring.model.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class HelloController {

    @GetMapping
    public ResponseEntity<List<Course>> listAll() {
        return null;
    }
}
