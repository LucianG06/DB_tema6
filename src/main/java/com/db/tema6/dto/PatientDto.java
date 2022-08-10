package com.db.tema6.dto;

import com.db.tema6.models.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {
    private String cnp;
    private String doctorName;

    public PatientDto(Patient patient) {
        this.cnp = patient.getCnp();
        this.doctorName = patient.getDoctor().getName();
    }


}
