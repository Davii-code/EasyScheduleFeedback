package com.doc.easyschedulefeedback.service;

import com.doc.easyschedulefeedback.dto.request.UserRequestDTO;
import com.doc.easyschedulefeedback.entities.User;
import com.doc.genericarchitecturesecurity.service.IAbstractService;

public interface IUserService extends IAbstractService<UserRequestDTO, User, Long> {
}
