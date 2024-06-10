package com.magicmoments.backendapi.controllers.forms;

import lombok.Data;

@Data
public class RegisterForm {
    private int id;
    private String email;
    private String name;
    private String surname;
    private String username;
    private String password;
}