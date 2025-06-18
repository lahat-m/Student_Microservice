package com.mmaas.StudentMicroservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mmaas.StudentMicroservice.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}