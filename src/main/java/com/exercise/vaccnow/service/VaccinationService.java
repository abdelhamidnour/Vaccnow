package com.exercise.vaccnow.service;

import com.exercise.vaccnow.dto.PaymentDto;
import com.exercise.vaccnow.dto.VaccinationReservationDto;
import com.exercise.vaccnow.dto.VaccinationReservationResponse;
import com.exercise.vaccnow.model.BranchVaccines;
import com.exercise.vaccnow.model.Ticket;
import com.exercise.vaccnow.repositry.BranchVaccRepository;
import com.exercise.vaccnow.repositry.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class VaccinationService {
    @Autowired
    BranchVaccRepository branchVaccRepository;
    @Autowired
    TicketRepo ticketRepo;

    public VaccinationReservationResponse scheduleVaccination(VaccinationReservationDto request) {
        BranchVaccines branchVaccines = branchVaccRepository.findByBranchIdAndVaccinesId(request.getBranchId(), request.getVaccId());

        LocalDateTime dateTime = LocalDateTime.parse(request.getDay());
        LocalDateTime dateRange1 = dateTime.plusMinutes(15l);
        LocalDateTime dateRange2 = dateTime.minusMinutes(15l);
        List<Ticket> tickets = ticketRepo.findByBranchVaccines_IdAndDayBetween(branchVaccines.getId(), dateRange2,dateRange1);
        if (tickets.isEmpty()) {
            Ticket ticket = new Ticket();
            ticket.setBranchVaccines(branchVaccines);
            ticket.setConfirmed(false);
            ticket.setUserName(request.getName());
            ticket.setUserEmail(request.getEmail());
            ticket.setDay(dateTime);
            ticketRepo.save(ticket);
            return new VaccinationReservationResponse(ticket.getId());
        }
        return null;
    }

    public Boolean pay(PaymentDto request) {
        return false;
    }
}
