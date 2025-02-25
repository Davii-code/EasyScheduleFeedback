package com.doc.easyschedulefeedback.repository;

import com.doc.easyschedulefeedback.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
