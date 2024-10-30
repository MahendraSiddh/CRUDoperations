package com.example.CRUDoperations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUDoperations.dao.StudentRepository;
import com.example.CRUDoperations.entities.Student;

import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired      
    private StudentRepository studentRepository;
    public Student getStudentById(int id)
    {
        Optional<Student> optionalStudent = this.studentRepository.findById(id);
        if(optionalStudent.isPresent())
        {
            return optionalStudent.get();
        }else
        {
            return null;
        }
        
    }
    public Student addStudent(Student student)
    {
        Student addedStudent =  studentRepository.save(student);
        return addedStudent;
    }
    public void deleteStudentById(int id)
    {
        studentRepository.deleteById(id);
    }
    public Student putStudent(Student student,int id)
    {
        student.setId(id);
        Student updatedStudent = studentRepository.save(student);
        return updatedStudent;
    }
}
