package com.digitalnurture.student.repository;

import com.digitalnurture.student.entity.Student;
import jakarta.persistence.criteria.*;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentSpecificationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Student> findByDeptWithCriteria(String dept) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> query = cb.createQuery(Student.class);
        Root<Student> root = query.from(Student.class);
        query.select(root).where(cb.equal(root.get("dept"), dept));
        return entityManager.createQuery(query).getResultList();
    }
}
