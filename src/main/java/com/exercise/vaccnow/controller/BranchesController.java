package com.exercise.vaccnow.controller;

import com.exercise.vaccnow.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchesController {
    @Autowired
    private BranchService branchService;
    @GetMapping("/getAllBranches")
    public String getAllBranches(){
        return branchService.getAllBranches();
    }
    @GetMapping("/getVaccinesPerBranch/{branchId}")
    public String getAllBranches(@PathVariable String branchId){
        return branchService.getAllBranches();
    }
}
