package com.db.tema6.controllers;

import com.db.tema6.enums.Specialty;
import com.db.tema6.exceptions.NoDoctorException;
import com.db.tema6.models.Doctor;
import com.db.tema6.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/doctor/all")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping(path = "doctor/{doctorId}/{patientId}")
    public void addPatient(@PathVariable("doctorId")Integer doctorId,
                           @PathVariable("patientId")Integer patientId) throws NoDoctorException {
        doctorService.addPatient(doctorId, patientId);
    }

    @GetMapping("doctor/all?specialty={specialty}")
    public List<Doctor> getAllDoctorsBySpecialty(@PathVariable Specialty specialty) {
        return doctorService.getAllDoctorsBySpecialty(specialty);
    }
}
