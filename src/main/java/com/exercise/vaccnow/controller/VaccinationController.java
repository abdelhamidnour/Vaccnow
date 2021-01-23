package com.exercise.vaccnow.controller;

import com.exercise.vaccnow.dto.PaymentDto;
import com.exercise.vaccnow.dto.VaccinationReservationDto;
import com.exercise.vaccnow.dto.VaccinationReservationResponse;
import com.exercise.vaccnow.service.VaccinationService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
public class VaccinationController {
    @Autowired
    VaccinationService vaccinationService;

    @PostMapping(path = "/scheduleVaccination",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VaccinationReservationResponse> scheduleVaccination(@RequestBody @Valid VaccinationReservationDto request){
        return ResponseEntity.ok(vaccinationService.scheduleVaccination(request));
    }
    @PostMapping("/payment" )
    public ResponseEntity<Boolean> scheduleVaccination(@RequestBody @Valid PaymentDto request){
        return ResponseEntity.ok(vaccinationService.pay(request));
    }
}
