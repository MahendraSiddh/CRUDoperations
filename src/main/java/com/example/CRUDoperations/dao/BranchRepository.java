package com.example.CRUDoperations.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUDoperations.entities.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch,Integer>{
    
}
