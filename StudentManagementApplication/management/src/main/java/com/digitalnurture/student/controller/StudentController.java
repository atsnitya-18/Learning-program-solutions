package com.digitalnurture.student.controller;

import com.digitalnurture.student.entity.Student;
import com.digitalnurture.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/filter")
    public List<Student> getStudentsByDeptAndCourse(
            @RequestParam String dept,
            @RequestParam String course) {
        return studentService.getStudentsByDeptAndCourse(dept, course);
    }
}
