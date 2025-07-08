package com.digitalnurture.student;

import com.digitalnurture.student.entity.Course;
import com.digitalnurture.student.entity.Student;
import com.digitalnurture.student.repository.CourseRepository;
import com.digitalnurture.student.repository.StudentRepository;
import com.digitalnurture.student.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CrudRunner implements CommandLineRunner {

    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;
    private final StudentService studentService;

    public CrudRunner(StudentRepository studentRepo,
                      CourseRepository courseRepo,
                      StudentService studentService) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
        this.studentService = studentService;
    }

    @Override
    public void run(String... args) {

        Course java = new Course(null, "Java");
        Course sql = new Course(null, "SQL");
        courseRepo.saveAll(Arrays.asList(java, sql));

        Student s1 = new Student(null, "Nitya", "CSE");
        Student s2 = new Student(null, "Akash", "ECE");

        s1.setCourses(Arrays.asList(java, sql));
        s2.setCourses(Arrays.asList(sql));

        studentRepo.saveAll(Arrays.asList(s1, s2));

        List<Student> filteredStudents = studentService.getStudentsByDeptAndCourse("CSE", "Java");
        filteredStudents.forEach(s -> System.out.println("Filtered Student: " + s.getName()));
    }
}
