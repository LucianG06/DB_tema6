package com.db.tema6.mappers;

import com.db.tema6.dto.PatientDto;
import com.db.tema6.models.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDto toPatientDto (Patient patient);
}
