package com.ndh.loginregistrationverification.dto;

import lombok.*;

@Data
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
