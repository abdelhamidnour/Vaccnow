package com.exercise.vaccnow.repositry;

import com.exercise.vaccnow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {
    boolean findOneByBranchVaccinesIdAndByTAndTimeSlot(int BranchVaccinesId);
}
