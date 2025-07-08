package com.digitalnurture.student.repository;

import com.digitalnurture.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {


    @Query("SELECT s FROM Student s WHERE s.dept = ?1")
    List<Student> findByDept(String dept);

    @Query("SELECT s FROM Student s WHERE LOWER(s.name) LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<Student> searchByName(String keyword);

    @Query(value = "SELECT * FROM student WHERE dept = ?1", nativeQuery = true)
    List<Student> findByDeptNative(String dept);

    @Query("SELECT COUNT(s) FROM Student s WHERE s.dept = ?1")
    long countByDept(String dept);
}
