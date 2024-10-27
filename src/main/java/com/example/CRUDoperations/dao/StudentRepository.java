package com.example.CRUDoperations.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUDoperations.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
}
