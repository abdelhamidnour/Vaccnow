package com.exercise.vaccnow.controller;

import com.exercise.vaccnow.dto.BranchDto;
import com.exercise.vaccnow.dto.TimeSlotDto;
import com.exercise.vaccnow.dto.VaccineDto;
import com.exercise.vaccnow.model.Branch;
import com.exercise.vaccnow.model.Vaccines;
import com.exercise.vaccnow.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BranchesController {
    @Autowired
    private BranchService branchService;
    @GetMapping("/getAllBranches")
    public ResponseEntity<List<Branch>> getAllBranches(){
        return ResponseEntity.ok(branchService.getAllBranches());
    }
    @GetMapping("/getVaccinesPerBranch/{branchId}")
    public ResponseEntity<List<Vaccines>> getAllVaccPerBranch(@Valid @PathVariable String branchId){
        return ResponseEntity.ok(branchService.getAllVaccPerBranches(branchId));
    }
    @GetMapping("/getAvialbleVacPerBranch/{branchId}/{vaccId}")
    public ResponseEntity<Boolean> getSpecificVaccPerBranch(@Valid @PathVariable String branchId,@Valid @PathVariable String vaccId){
        return ResponseEntity.ok(branchService.getSpecificVaccPerBranch(branchId,vaccId));
    }
    @GetMapping("/getAvialblePerBranch/{branchId}/")
    public ResponseEntity<TimeSlotDto> getAvailableTimePerBranch(@PathVariable String branchId){
        return ResponseEntity.ok(branchService.getAvailableTimePerBranch(branchId));
    }
}
