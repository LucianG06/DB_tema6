package com.db.tema6.dto;

import com.db.tema6.enums.Specialty;
import com.db.tema6.models.Doctor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    private String name;
    private Specialty specialty;

    public DoctorDto(Doctor doctor) {
        this.name = doctor.getName();
        this.specialty = doctor.getSpecialty();
    }
}
