package com.example.CRUDoperations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student> getStudentById(@PathVariable int id)
    {
        Student student = studentService.getStudentById(id);
        if(student==null)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else 
        {
            return new ResponseEntity<>(student,HttpStatus.OK);
        }
    }
    @PostMapping("student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
    }
    @DeleteMapping("student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int id)
    {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("student/{id}")
    public ResponseEntity<Student> putStudent(@RequestBody Student student, @PathVariable("id") int id)
    {
        
        Student newStudent = studentService.putStudent(student, id);
        return new ResponseEntity<>(newStudent,HttpStatus.NO_CONTENT);
    }
}
