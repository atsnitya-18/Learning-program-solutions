package com.digitalnurture.student.repository;

import com.digitalnurture.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByNameContaining(String keyword);
    List<Student> findByDept(String dept);
    List<Student> findTop3ByOrderByIdDesc();
}
