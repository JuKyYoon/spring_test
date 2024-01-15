package com.spring.test.model.dto;

public class Color {
    String color;
    String value;

    public Color(String color, String value) {
        this.color = color;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }
}
