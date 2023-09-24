package com.container.docker.controller;

import com.container.docker.model.Student;
import com.container.docker.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health-check")
@Slf4j
public class HealthCheckController {

    private final StudentRepository studentRepository;

    public HealthCheckController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public ResponseEntity healthCheck() {
        log.info("save object {}", studentRepository.save(new Student(null,"Lucas", "lucas@gmail.com")));
        return ResponseEntity.ok().body("application is responding");
    }

}
