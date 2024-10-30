package com.example.CRUDoperations.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "BRANCH")
public class Branch {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "branch",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students;
    public Branch()
    {

    }
    public Branch(int code,String name, List<Student> students)
    {
        this.id = code;
        this.name = name;
        this.students = students;
    }
    public int getCode() {
        return this.id;
    }
    public void setCode(int code) {
        this.id = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudents(List<Student> students)
    {
        this.students = students;
    }
    public List<Student> getStudents()
    {
        return this.students;
    }
}
