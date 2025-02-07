package com.doc.easyschedulefeedback.repository;

import com.doc.easyschedulefeedback.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
