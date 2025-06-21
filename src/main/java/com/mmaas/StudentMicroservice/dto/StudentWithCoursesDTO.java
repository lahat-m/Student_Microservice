package com.mmaas.StudentMicroservice.dto;

import java.util.List;

import com.mmaas.StudentMicroservice.model.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentWithCoursesDTO {
    private String studentId;
    private String name;
    private String email;
    private int age;
    private List<CourseDetailsDTO> enrolledCourses;

    public StudentWithCoursesDTO(Student student, List<CourseDetailsDTO> enrolledCourses) {
        this.studentId = student.getStudentId();
        this.name = student.getName();
        this.email = student.getEmail();
        this.age = student.getAge();
        this.enrolledCourses = enrolledCourses;
    }
}