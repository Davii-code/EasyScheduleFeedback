package com.doc.easyschedulefeedback.mapper;
import com.doc.easyschedulefeedback.dto.list.UserListDTO;
import com.doc.easyschedulefeedback.dto.request.UserRequestDTO;
import com.doc.easyschedulefeedback.dto.response.UserResponseDTO;
import com.doc.easyschedulefeedback.entities.User;
import com.doc.genericarchitecturesecurity.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface UserMapper extends GenericMapper<UserRequestDTO, UserResponseDTO, UserListDTO, User, Long> {
}
