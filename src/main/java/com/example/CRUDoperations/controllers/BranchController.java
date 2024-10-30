package com.example.CRUDoperations.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.CRUDoperations.entities.Branch;
import com.example.CRUDoperations.entities.Student;
import com.example.CRUDoperations.services.BranchService;
import java.util.List;

@RestController
public class BranchController {

    @Autowired
    BranchService branchService;

    @GetMapping("/branch/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable(name = "id") int id)
    {
        Branch branch = branchService.getBranchById(id);
        if(branch==null)
        {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else
        {
            return new ResponseEntity<>(branch,HttpStatus.OK);
        }
    }
    @PostMapping("/branch")
    public ResponseEntity<Branch> postBranch(@RequestBody Branch branch)
    {
        for(Student student:branch.getStudents())
        {
            student.setBranch(branch);
        }
        Branch savedBranch = branchService.postBranch(branch);
        return new ResponseEntity<>(savedBranch,HttpStatus.CREATED);
    }
    @GetMapping("/branch/{id}/students")
    public ResponseEntity<List<Student> > getStudentsByBranchId(@PathVariable(name = "id") int id)
    {
        List<Student> students = branchService.getStudentsByBranchId(id);
        if(students==null)
        {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else
        {
            return new ResponseEntity<>(students,HttpStatus.OK);
        }
    }
    @DeleteMapping("branch/{id}")
    public ResponseEntity<Void> deleteBranchById(@PathVariable(name = "id") int id)
    {
        branchService.deleteBranchById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
