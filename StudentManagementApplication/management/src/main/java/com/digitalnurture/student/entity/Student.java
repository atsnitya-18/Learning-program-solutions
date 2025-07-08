package com.digitalnurture.student.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dept;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    @JsonManagedReference
    private List<Course> courses;

    public Student() {}

    public Student(Long id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }
    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }
}