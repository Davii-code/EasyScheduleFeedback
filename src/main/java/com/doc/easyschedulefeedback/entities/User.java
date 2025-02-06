package com.doc.easyschedulefeedback.entities;

import com.doc.easyschedulefeedback.enums.TypeUser;
import com.doc.genericarchitecturesecurity.domain.GenericModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements GenericModel<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true, unique = true)
    private String email;

    @Column(nullable = false)
    private Boolean enabled;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private TypeUser typeUser;

    @Column(nullable = false)
    private LocalDateTime createin;

    @Column(nullable = false)
    private LocalDateTime updatedin;
}
