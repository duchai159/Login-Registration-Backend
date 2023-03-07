package com.ndh.loginregistrationverification.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
@Builder
public class ResponseObject<T> {
    private Integer result;
    private String code;
    private String message;
    private T data;
    public static <T> ResponseObject<T> of(T data){
        return new ResponseObject<>(1, "200", "Success", data);
    }
    public static ResponseEntity<?> response(Object object){
        return ResponseEntity.ok(ResponseObject.of(object));
    }
}
