package com.exercise.vaccnow.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Setter
@Getter
public class VaccinationReservationDto {
    private int branchId;
    private int vaccId;
    private String day;
    private String name;
    private String email;
}
