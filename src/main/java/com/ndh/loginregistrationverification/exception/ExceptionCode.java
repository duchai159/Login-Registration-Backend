package com.ndh.loginregistrationverification.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
    //Status code 4xx
    EMAIL_EXISTED("400", "Email is existed"),
    EMAIl_NOT_VALID("402", "Email is not valid"),

    //Status code 5xx
    TOKEN_NOT_FOUND("501", "Token not found"),
    TOKEN_CONFIRMED("507", "Token is confirmed"),
    TOKEN_EXPIRED("506", "Token is expired");
    private String code;
    private String message;
    ExceptionCode(String code, String message){
        this.code = code;
        this.message = message;
    }
}
