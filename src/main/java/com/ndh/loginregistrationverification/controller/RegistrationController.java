package com.ndh.loginregistrationverification.controller;

import com.ndh.loginregistrationverification.dto.RegistrationRequest;
import com.ndh.loginregistrationverification.service.impl.RegistrationServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationServiceImpl registrationServiceImpl;
    @PostMapping
    public ResponseEntity<?> register(@RequestBody RegistrationRequest request){
        return registrationServiceImpl.register(request);
    }
    @GetMapping(path = "confirm")
    public ResponseEntity<?> confirm(@RequestParam("token") String token){
        return registrationServiceImpl.confirmToken(token);
    }
}
