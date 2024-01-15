package com.spring.test.controller;

import com.spring.test.model.response.DefaultResponse;
import com.spring.test.model.response.DtoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public ResponseEntity<DefaultResponse> checkAPI() {
        return ResponseEntity.status(HttpStatus.OK).body(DtoResponse.of(HttpStatus.OK, "success"));
    }

}
