package com.exercise.vaccnow.repositry;

import com.exercise.vaccnow.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
        List<Branch> findAll();
}
