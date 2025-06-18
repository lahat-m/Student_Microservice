package com.mmaas.StudentMicroservice.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private String name;
    private String email;
    private int age;
}
