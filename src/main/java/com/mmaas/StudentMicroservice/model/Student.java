package com.mmaas.StudentMicroservice.model;

import lombok.*;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    private String StudentId;
    private String name;
    private String email;
    private int age;
    private List<String> enrolledCourses; // List of course IDs the student is enrolled in

}
