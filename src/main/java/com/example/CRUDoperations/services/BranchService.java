package com.example.CRUDoperations.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUDoperations.dao.BranchRepository;
import com.example.CRUDoperations.entities.Branch;
import com.example.CRUDoperations.entities.Student;

@Service
public class BranchService {
    
    @Autowired
    BranchRepository branchRepository;
    public Branch getBranchById(int id)
    {
        Optional<Branch> branch = branchRepository.findById(id);
        if(branch.isPresent())
        {
            return branch.get();
        }else
        {
            return null;
        }
    }
    public Branch postBranch(Branch branch)
    {
        Branch savedBranch = branchRepository.save(branch);
        return savedBranch;
    }
    public Branch updateBranch(Branch branch)
    {
        Branch updatedBranch = branchRepository.save(branch);
        return updatedBranch;
    }
    public void deleteBranchById(int id)
    {
        branchRepository.deleteById(id);
    }
    public List<Student> getStudentsByBranchId(int id)
    {
        Optional<Branch> branch= branchRepository.findById(id);
        if(branch.isPresent())
        {
            return branch.get().getStudents();
        }
        else
        {
            return null;
        }
    }
}
