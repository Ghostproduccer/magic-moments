package com.magicmoments.backendapi.service.dto;

import lombok.Data;

@Data
public class UsersDto {
    private int id;
    private String email;
    private String name;
    private String surname;
    private String username;
    private String password;
}
