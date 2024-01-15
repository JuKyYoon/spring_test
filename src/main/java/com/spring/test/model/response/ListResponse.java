package com.spring.test.model.response;

import java.util.List;
import org.springframework.http.HttpStatus;

public class ListResponse<T> extends DefaultResponse {

    List<T> resList;

    ListResponse(HttpStatus status, String message, List<T> resList) {
        super(status, message);
        this.resList = resList;
    }

    public List<T> getResList() {
        return resList;
    }

    public static <T> ListResponse<T> of(HttpStatus status, String message, List<T> list) {
        return new ListResponse<>(status, message, list);
    }
}
