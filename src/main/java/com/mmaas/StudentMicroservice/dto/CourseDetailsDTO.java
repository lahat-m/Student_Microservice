package com.mmaas.StudentMicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDetailsDTO {
    private String courseId;
    private String courseCode;
    private String courseName;
    private String description;
    private String courseCredits;
}
