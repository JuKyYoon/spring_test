package com.spring.test.controller;

import com.spring.test.model.dto.Color;
import com.spring.test.model.response.ListResponse;
import com.spring.test.service.ColorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/color")
public class ColorController {

    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("")
    public ResponseEntity<ListResponse<Color>> getColors() {
        List<Color> result = colorService.getColors();
        if(result != null) {
            return ResponseEntity.status(HttpStatus.OK).body(ListResponse.of(HttpStatus.OK, "success", result));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ListResponse.of(HttpStatus.INTERNAL_SERVER_ERROR, "fail", null));
        }
    }
}
