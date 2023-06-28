package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.models.Students;

public interface StudentsRepository extends MongoRepository<Students, Integer> {

}
