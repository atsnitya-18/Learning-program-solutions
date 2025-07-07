package com.digitalnurture.student.controller;

import com.digitalnurture.student.entity.Student;
import com.digitalnurture.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentCourseController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/search")
    public List<Student> search(@RequestParam String keyword) {
        return studentRepository.findByNameContaining(keyword);
    }

    @GetMapping("/dept/{dept}")
    public List<Student> findByDept(@PathVariable String dept) {
        return studentRepository.findByDept(dept);
    }

    @GetMapping("/top3")
    public List<Student> top3() {
        return studentRepository.findTop3ByOrderByIdDesc();
    }
}
