package com.db.tema6.services;

import com.db.tema6.enums.Specialty;
import com.db.tema6.models.Patient;
import com.db.tema6.models.Visit;
import com.db.tema6.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        List<Patient> aux = new ArrayList<>();
        patientRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Patient> getPatientById(Integer id) {
        return patientRepository.findById(id);
    }

    public void insertPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    public Patient getPatientByCnp(String cnp) {
        return getAllPatients().stream().filter(p -> Objects.equals(p.getCnp(), cnp)).findFirst().get();
    }

    public List<Visit> getVisitsByCnpAndSpecialty(String cnp, Specialty specialty) {
        Patient patient = getPatientByCnp(cnp);

        return patient.getVisits().stream().filter(visit -> visit.getDoctor().getSpecialty() == specialty).toList();
    }
}
