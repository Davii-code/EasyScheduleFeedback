package com.doc.easyschedulefeedback.controller.impl;

import com.doc.easyschedulefeedback.controller.IAppointmentController;
import com.doc.easyschedulefeedback.dto.list.AppointmentListDTO;
import com.doc.easyschedulefeedback.dto.request.AppointmentRequestDTO;
import com.doc.easyschedulefeedback.dto.response.AppointmentResponseDTO;
import com.doc.easyschedulefeedback.entities.Appointment;
import com.doc.easyschedulefeedback.mapper.AppointmentMapper;
import com.doc.easyschedulefeedback.service.impl.AppointmentService;
import com.doc.genericarchitecturesecurity.controller.impl.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="${api.version}/appointment")
public class AppointmentController extends AbstractCrudController<AppointmentRequestDTO, AppointmentResponseDTO, AppointmentListDTO, Appointment, AppointmentService, AppointmentMapper,Long> implements IAppointmentController {
}
