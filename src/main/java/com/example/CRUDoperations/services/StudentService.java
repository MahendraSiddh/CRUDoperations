package com.example.CRUDoperations.services;

import org.springframework.stereotype.Service;

import com.example.CRUDoperations.entities.Student;

@Service
public class StudentService {
    
    public Student getStudentById(int id)
    {
        return null;
    }
    public Student addStudent(Student student)
    {
        return student;
    }
    public void deleteStudentById(int id)
    {
        return;
    }
    public Student putStudent(Student student,int id)
    {
        return student;
    }
}
