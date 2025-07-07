package com.digitalnurture.student.repository;

import com.digitalnurture.student.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
