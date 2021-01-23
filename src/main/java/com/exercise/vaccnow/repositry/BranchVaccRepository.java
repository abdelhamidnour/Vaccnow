package com.exercise.vaccnow.repositry;

import com.exercise.vaccnow.model.Branch;
import com.exercise.vaccnow.model.BranchVaccines;
import com.exercise.vaccnow.model.Vaccines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BranchVaccRepository extends JpaRepository<BranchVaccines,Integer> {
    List<BranchVaccines> findByBranchId(int branchId);
    BranchVaccines findByBranchIdAndVaccinesId(int branchId,int vaccinesId);


}
