package com.exercise.vaccnow.repositry;

import com.exercise.vaccnow.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepo extends JpaRepository<TimeSlot,Integer> {
}
