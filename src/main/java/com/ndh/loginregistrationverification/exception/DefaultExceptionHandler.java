package com.ndh.loginregistrationverification.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class DefaultExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorMessage> handleBusinessException(BusinessException businessException){
        String code = businessException.getExceptionCode().getCode();
        String message = businessException.getExceptionCode().getMessage();
        ErrorMessage errorMessage = ErrorMessage.builder()
                .result(0)
                .code(code)
                .message(message)
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
