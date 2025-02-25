package com.doc.easyschedulefeedback.dto.request;

import com.doc.genericarchitecturesecurity.annotation.MandatoryField;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentRequestDTO {

    @MandatoryField(name = "Usuário")
    private Long userId;

    @MandatoryField(name = "Serviço")
    private Long serviceId;

    @MandatoryField(name = "Data do Agendamento")
    private LocalDateTime appointmentDate;
}
