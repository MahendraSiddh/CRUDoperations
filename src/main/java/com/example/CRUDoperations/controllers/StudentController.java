package com.example.CRUDoperations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUDoperations.entities.Student;
import com.example.CRUDoperations.services.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        Student student = studentService.getStudentById(id);
        return student;
    }
    @PostMapping("student")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }
    @DeleteMapping("student/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        studentService.deleteStudentById(id);
        return;
    }
    @PutMapping("student")
    public Student putStudent(@RequestBody Student student)
    {
        return studentService.putStudent(student);
    }
}
