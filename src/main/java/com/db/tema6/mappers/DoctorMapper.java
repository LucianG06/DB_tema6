package com.db.tema6.mappers;

import com.db.tema6.dto.DoctorDto;
import com.db.tema6.models.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDto toDoctorDto (Doctor doctor);
}
