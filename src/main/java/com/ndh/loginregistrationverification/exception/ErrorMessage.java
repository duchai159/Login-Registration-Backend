package com.ndh.loginregistrationverification.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorMessage {
    private Integer result;
    private String code;
    private String message;
    private Object data;
    public static ErrorMessage getError(String code, String message){
        return new ErrorMessage(0, code, message, null);
    }
}
