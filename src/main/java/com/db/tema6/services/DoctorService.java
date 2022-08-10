package com.db.tema6.services;

import com.db.tema6.enums.Specialty;
import com.db.tema6.exceptions.NoDoctorException;
import com.db.tema6.models.Doctor;
import com.db.tema6.models.Patient;
import com.db.tema6.repositories.DoctorRepository;
import com.db.tema6.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PatientRepository patientRepository;

    public List<Doctor> getAllDoctors() {
        List<Doctor> aux = new ArrayList<>();
        doctorRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Doctor> getDoctorById(Integer id) {
        return doctorRepository.findById(id);
    }

    public void insertDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void updateDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void deleteDoctor(Doctor doctor) {
        doctorRepository.delete(doctor);
    }

    public void addPatient(Integer doctorId, Integer patientId) throws NoDoctorException {
        Optional<Doctor> doctor = doctorRepository.findById(doctorId);
        if (doctor.isEmpty()) {
            throw new NoDoctorException();
        } else {
            Optional<Patient> patient = patientRepository.findById(patientId);
            patient.ifPresent(value -> doctor.get().addPatient(value));
        }
    }

    public List<Doctor> getAllDoctorsBySpecialty(Specialty specialty) {
        return getAllDoctors().stream().filter(d -> d.getSpecialty() == specialty).toList();
    }
}
