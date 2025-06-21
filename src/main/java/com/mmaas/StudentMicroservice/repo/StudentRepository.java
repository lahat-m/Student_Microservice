package com.mmaas.StudentMicroservice.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmaas.StudentMicroservice.model.Student;


public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findByEmail(String email);
}