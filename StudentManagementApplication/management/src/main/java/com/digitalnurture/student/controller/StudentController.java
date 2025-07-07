
package com.digitalnurture.student.controller;

import com.digitalnurture.student.entity.Student;
import com.digitalnurture.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/test")
    public String testApi() {
        return "Student API is up and running!";
    }

   
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentRepository.deleteById(id);
    }
}


   

