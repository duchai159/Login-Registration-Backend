package com.ndh.loginregistrationverification.service;

import com.ndh.loginregistrationverification.model.ConfirmationToken;

import java.util.Optional;

public interface ConfirmationTokenService {
    public void saveConfirmationToken(ConfirmationToken token);
    public Optional<ConfirmationToken> getToken(String token);
    public void setConfirmedAt(String token);
}
