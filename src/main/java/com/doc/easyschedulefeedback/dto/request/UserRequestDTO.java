package com.doc.easyschedulefeedback.dto.request;

import com.doc.genericarchitecturesecurity.annotation.MandatoryField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
    @MandatoryField(name = "Nome")
    private String name;

    @MandatoryField(name = "Login")
    private String login;

    @MandatoryField(name = "Senha")
    private String password;

    @MandatoryField(name = "Confirmação de Senha")
    private String confirmPassword;

    @MandatoryField(name = "Email")
    private String email;


}
