package com.exercise.vaccnow.repositry;

import com.exercise.vaccnow.dto.TimeSlotDto;
import com.exercise.vaccnow.model.Branch;
import com.exercise.vaccnow.model.BranchVaccines;
import com.exercise.vaccnow.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {
    List<Ticket> findByBranchVaccines_IdAndDayBetween(Integer id, LocalDateTime d1,LocalDateTime d2);
    List<TimeSlotDto> findByBranchVaccinesInAndDayAfter(List<BranchVaccines> branchVaccines, LocalDateTime day);

}
