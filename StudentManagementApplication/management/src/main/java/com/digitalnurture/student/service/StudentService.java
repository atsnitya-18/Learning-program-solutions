package com.digitalnurture.student.service;

import com.digitalnurture.student.entity.Student;
import com.digitalnurture.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

 
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

 
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }


    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
