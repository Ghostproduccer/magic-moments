package com.magicmoments.backendapi.service.srv;

import com.magicmoments.backendapi.service.dto.UsersDto;
import com.magicmoments.backendapi.service.mappers.UsersMapper;
import com.magicmoments.backendapi.service.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    UsersMapper usersMapper;

    public UsersDto saveUser(UsersDto usersDto) {
        usersRepository.save(usersMapper.toEntity(usersDto));
        return usersDto;
    }
}
