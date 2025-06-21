package com.mmaas.StudentMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mmaas.StudentMicroservice.dto.StudentDTO;
import com.mmaas.StudentMicroservice.exception.ResourceNotFoundException;
import com.mmaas.StudentMicroservice.model.Student;
import com.mmaas.StudentMicroservice.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(StudentDTO dto) {
        Optional<Student> existingStudentEmailOptional = studentRepository.findByEmail(dto.getEmail());
        if (existingStudentEmailOptional.isPresent()) {
            throw new ResourceNotFoundException("Student with email " + dto.getEmail() + " already exists.");
        }
        Student student = Student.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .age(dto.getAge())
                .build();
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    public Student updateStudent(String id, StudentDTO dto) {
        Student existing = getStudentById(id);
        existing.setName(dto.getName());
        existing.setEmail(dto.getEmail());
        existing.setAge(dto.getAge());
        return studentRepository.save(existing);
    }

    public void deleteStudent(String id) {
        Student existing = getStudentById(id);
        studentRepository.delete(existing);
    }
}
