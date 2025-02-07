package com.doc.easyschedulefeedback.controller.impl;

import com.doc.easyschedulefeedback.controller.IUserController;
import com.doc.easyschedulefeedback.dto.list.UserListDTO;
import com.doc.easyschedulefeedback.dto.request.UserRequestDTO;
import com.doc.easyschedulefeedback.dto.response.UserResponseDTO;
import com.doc.easyschedulefeedback.entities.User;
import com.doc.easyschedulefeedback.mapper.UserMapper;
import com.doc.easyschedulefeedback.service.impl.UserService;
import com.doc.genericarchitecturesecurity.controller.impl.AbstractCrudController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="${api.version}/user")
public class UserController extends AbstractCrudController<UserRequestDTO, UserResponseDTO, UserListDTO, User, UserService, UserMapper,Long> implements IUserController {
}
