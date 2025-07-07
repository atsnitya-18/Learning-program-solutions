package com.digitalnurture.student;

import com.digitalnurture.student.entity.Student;
import com.digitalnurture.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CrudRunner implements CommandLineRunner {

    private final StudentRepository repo;

    public CrudRunner(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student(0, "Nitya", "CSE");
        Student s2 = new Student(0, "Akash", "ECE");

        repo.save(s1);
        repo.save(s2);

        System.out.println("Saved Students:");
        repo.findAll().forEach(System.out::println);
    }
}
