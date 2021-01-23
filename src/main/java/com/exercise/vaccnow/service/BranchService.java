package com.exercise.vaccnow.service;

import com.exercise.vaccnow.dto.TimeSlotDto;
import com.exercise.vaccnow.model.Branch;
import com.exercise.vaccnow.model.BranchVaccines;
import com.exercise.vaccnow.model.Vaccines;
import com.exercise.vaccnow.repositry.BranchRepository;
import com.exercise.vaccnow.repositry.BranchVaccRepository;
import com.exercise.vaccnow.repositry.VaccinesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BranchService {
    @Autowired
    BranchRepository branchRepository;

    @Autowired
    BranchVaccRepository branchVaccRepository;
    @Autowired
    VaccinesRepo vaccinesRepo;


    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    public List<Vaccines> getAllVaccPerBranches(String branchId) {
        List<Integer> ids = branchVaccRepository.findByBranchId(Integer.parseInt(branchId))
                .stream().map(x -> x.getVaccines().getId()).collect(Collectors.toList());
        return vaccinesRepo.findByIdIn(ids);
    }

    public Boolean getSpecificVaccPerBranch(String branchId, String vaccId) {
        return branchVaccRepository.findByBranchIdAndVaccinesId(Integer.parseInt(branchId),Integer.parseInt(vaccId))!=null;
    }

    public TimeSlotDto getAvailableTimePerBranch(String branchId) {
        return null;
    }
}
