package com.digitalnurture.student.repository;

import com.digitalnurture.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
