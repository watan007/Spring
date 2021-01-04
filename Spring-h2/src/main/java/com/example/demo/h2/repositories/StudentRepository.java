package com.example.demo.h2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.h2.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

}
