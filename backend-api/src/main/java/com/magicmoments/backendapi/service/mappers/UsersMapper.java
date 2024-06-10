package com.magicmoments.backendapi.service.mappers;

import com.magicmoments.backendapi.model.Users;
import com.magicmoments.backendapi.service.dto.UsersDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    UsersDto toDto(Users users);
    Users toEntity(UsersDto usersDto);

    List<UsersDto> toDtoList(List<Users> usersList);
    List<Users> toEntityList(List<UsersDto> usersDtoList);
}
