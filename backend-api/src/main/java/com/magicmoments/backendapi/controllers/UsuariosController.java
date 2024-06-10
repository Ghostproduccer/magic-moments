package com.magicmoments.backendapi.controllers;

import com.magicmoments.backendapi.controllers.forms.RegisterForm;
import com.magicmoments.backendapi.service.dto.UsersDto;
import com.magicmoments.backendapi.service.srv.UsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    public UsersDto registerUser(@RequestBody RegisterForm registroForm) {
        UsersDto usersDto = new UsersDto();

        BeanUtils.copyProperties(registroForm, usersDto);

        usersService.saveUser(usersDto);
        return usersDto;
    }
}
