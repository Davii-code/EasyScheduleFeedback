package com.doc.easyschedulefeedback.dto.list;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentListDTO {

    private Long id;
    private String serviceName;
    private LocalDateTime appointmentDate;
    private String status;
}
