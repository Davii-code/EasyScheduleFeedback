package com.doc.easyschedulefeedback.service;

import com.doc.easyschedulefeedback.dto.request.AppointmentRequestDTO;
import com.doc.easyschedulefeedback.entities.Appointment;
import com.doc.genericarchitecturesecurity.service.IAbstractService;

public interface IAppointmentService extends IAbstractService<AppointmentRequestDTO, Appointment,Long> {
}
