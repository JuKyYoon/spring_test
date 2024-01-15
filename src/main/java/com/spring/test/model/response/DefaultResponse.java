package com.spring.test.model.response;

import org.springframework.http.HttpStatus;

public class DefaultResponse {
    HttpStatus status;
    String message;

    DefaultResponse (HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public static DefaultResponse of(HttpStatus status, String message) {
        return new DefaultResponse(status, message);
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}