package com.doc.easyschedulefeedback.service.impl;

import com.doc.easyschedulefeedback.dto.list.AppointmentListDTO;
import com.doc.easyschedulefeedback.dto.request.AppointmentRequestDTO;
import com.doc.easyschedulefeedback.dto.response.AppointmentResponseDTO;
import com.doc.easyschedulefeedback.entities.Appointment;
import com.doc.easyschedulefeedback.mapper.AppointmentMapper;
import com.doc.easyschedulefeedback.repository.AppointmentRepository;
import com.doc.easyschedulefeedback.service.IAppointmentService;
import com.doc.genericarchitecturesecurity.service.impl.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService extends AbstractService<AppointmentRequestDTO, AppointmentResponseDTO, AppointmentListDTO, Appointment, AppointmentRepository, AppointmentMapper,Long> implements IAppointmentService {
    @Override
    protected void prepareToCreate(Appointment data) {

    }

    @Override
    protected void prepareToUpdate(Appointment dataDB) {

    }

    @Override
    protected void prepareToDelete(Appointment dataDB) {

    }
}
