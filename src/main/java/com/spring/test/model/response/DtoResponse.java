package com.spring.test.model.response;

import org.springframework.http.HttpStatus;

public class DtoResponse<T> extends DefaultResponse {

    T responseDto;

    public DtoResponse(HttpStatus status, String message, T responseDto) {
        super(status, message);
        this.responseDto = responseDto;
    }

    public T getResponseDto() {
        return responseDto;
    }

    public static <T> DtoResponse<T> of(HttpStatus status, String message, T responseDto) {
        return new DtoResponse<>(status, message, responseDto);
    }
}