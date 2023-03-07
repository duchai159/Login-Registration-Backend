package com.ndh.loginregistrationverification.service;

import com.ndh.loginregistrationverification.dto.RegistrationRequest;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {
    public ResponseEntity<?> register(RegistrationRequest request);
    public ResponseEntity<?> confirmToken(String token);
}
