package com.db.tema6.controllers;

import com.db.tema6.enums.Specialty;
import com.db.tema6.models.Patient;
import com.db.tema6.models.Visit;
import com.db.tema6.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("patient/all")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("patient/{cnp}")
    public Patient getPatientByCnp(@PathVariable String cnp) {
        return patientService.getPatientByCnp(cnp);
    }

    @GetMapping("patient/visits/all?cnp={cnp}&specialty={specialty}")
    public List<Visit> getVisitsByCnpAndSpecialty(@PathVariable String cnp, @PathVariable Specialty specialty) {
        return patientService.getVisitsByCnpAndSpecialty(cnp, specialty);
    }
}
