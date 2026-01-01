package com.example.springpractice.runner;

import com.example.springpractice.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseTestRunner implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DatabaseTestRunner(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("✅ Total students in DB = " + studentRepository.count());
    }
}
