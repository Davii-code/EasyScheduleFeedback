package com.doc.easyschedulefeedback.service.impl;

import com.doc.easyschedulefeedback.dto.list.UserListDTO;
import com.doc.easyschedulefeedback.dto.request.UserRequestDTO;
import com.doc.easyschedulefeedback.dto.response.UserResponseDTO;
import com.doc.easyschedulefeedback.entities.User;
import com.doc.easyschedulefeedback.mapper.UserMapper;
import com.doc.easyschedulefeedback.repository.UserRepository;
import com.doc.easyschedulefeedback.service.IUserService;
import com.doc.genericarchitecturesecurity.service.impl.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<UserRequestDTO, UserResponseDTO, UserListDTO, User, UserRepository, UserMapper, Long>
        implements IUserService {
    @Override
    protected void prepareToCreate(User data) {

    }

    @Override
    protected void prepareToUpdate(User dataDB) {

    }

    @Override
    protected void prepareToDelete(User dataDB) {

    }
}
