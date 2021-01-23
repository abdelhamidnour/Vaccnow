package com.exercise.vaccnow.service;

import com.exercise.vaccnow.dto.PaymentDto;
import com.exercise.vaccnow.dto.VaccinationReservationDto;
import com.exercise.vaccnow.dto.VaccinationReservationResponse;
import com.exercise.vaccnow.model.BranchVaccines;
import com.exercise.vaccnow.repositry.BranchVaccRepository;
import com.exercise.vaccnow.repositry.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class VaccinationService {
    @Autowired
    BranchVaccRepository branchVaccRepository;
    @Autowired
    TicketRepo ticketRepo;

    public VaccinationReservationResponse scheduleVaccination(VaccinationReservationDto request) {
        BranchVaccines branchVaccines  =  branchVaccRepository.findByBranchIdAndVaccinesId(request.getBranchId(),request.getVaccId());

        LocalDateTime dateTime = LocalDateTime.parse(request.getStartTime().toString());

//         boolean duplicat = ticketRepo.findOneByBranchVaccinesIdAndByTAndTimeSlot(branchVaccines.getId(),)
        return null;
    }

    public Boolean pay(PaymentDto request) {
        return false;
    }
}
