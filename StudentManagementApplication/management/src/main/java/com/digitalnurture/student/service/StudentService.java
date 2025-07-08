package com.digitalnurture.student.service;

import com.digitalnurture.student.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Student> getStudentsByDeptAndCourse(String dept, String courseTitle) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = cb.createQuery(Student.class);
        Root<Student> student = query.from(Student.class);
        Join<Object, Object> courses = student.join("courses");

        Predicate deptPredicate = cb.equal(student.get("dept"), dept);
        Predicate coursePredicate = cb.equal(courses.get("title"), courseTitle);

        query.select(student).distinct(true).where(cb.and(deptPredicate, coursePredicate));
        return entityManager.createQuery(query).getResultList();
    }
}
