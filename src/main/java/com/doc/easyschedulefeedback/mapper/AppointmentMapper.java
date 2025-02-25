package com.doc.easyschedulefeedback.mapper;

import com.doc.easyschedulefeedback.dto.list.AppointmentListDTO;
import com.doc.easyschedulefeedback.dto.request.AppointmentRequestDTO;
import com.doc.easyschedulefeedback.dto.response.AppointmentResponseDTO;
import com.doc.easyschedulefeedback.entities.Appointment;
import com.doc.genericarchitecturesecurity.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface AppointmentMapper extends GenericMapper<AppointmentRequestDTO, AppointmentResponseDTO, AppointmentListDTO, Appointment,Long> {
}
