package com.exercise.vaccnow.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;
@Setter
@Getter
public class VaccinationReservationDto {
    private int branchId;
    private int vaccId;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "hh:mm")
    private Time startTime;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:DD")
    private Date day;
    private String name;
    private String email;
}
