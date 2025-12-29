package com.example.springpractice.Java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    // New: moved Student model here so no separate Student.java is required
    public static class Student {
        private Long id;
        private String name;
        private Integer age;
        private String email;
        private String PhoneNumber;

        public Student(Long id, String name, Integer age, String email) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
            this.PhoneNumber = PhoneNumber;
        }

        public Long getId() { return id; }
        public String getName() { return name; }
        public Integer getAge() { return age; }
        public String getEmail() { return email; }
        public String getPhoneNumber() { return PhoneNumber; }

        public void setId(Long id) { this.id = id; }
        public void setName(String name) { this.name = name; }
        public void setAge(Integer age) { this.age = age; }
        public void setEmail(String email) { this.email = email; }
        public void setPhoneNumber(String PhoneNumber){this.PhoneNumber = PhoneNumber;}
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(1L, "Lokesh Yalla", 26, "lokeshyalla@example.com"),
                new Student(2L, "Pujitha Chatakondu", 21, "pujithach@exmple.com"),
                new Student(3L, "lalitesh Yalla", 21, "laliteshyalla@example.com"),
                new Student(4L, "Srinivasarao Yalla", 19, "Srinivasarao@example.com"),
                new Student(5L, "Seetha Laxmi Yalla", 21, "SeethaLaxmiYalla@exmple.com"),
                new Student(6L, "Pujitha Chatakondu", 21, "pujithach@exmple.com"),
                new Student(7L, "Nikhil Bava", 21, "nikhilbava@exmple.com"),
                new Student(8L, "Ruthika Chelli", 21, "Ruthika@exmple.com")

        );
    }
}
