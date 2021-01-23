package com.exercise.vaccnow.dto;

import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public interface TimeSlotDto {
    @Value("#{target.day}")
    public LocalDateTime getDay();
}
