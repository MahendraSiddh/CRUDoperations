package com.example.CRUDoperations.services;

import org.springframework.stereotype.Service;

import com.example.CRUDoperations.entities.Student;

@Service
public class StudentService {
    
    public Student getStudentById(int id)
    {
        Student student = new Student(1, "mahendra");
        return student;
    }
    public void addStudent(Student student)
    {
        return;
    }
    public void deleteStudentById(int id)
    {
        return;
    }
    public Student putStudent(Student student)
    {
        return null;
    }
}
