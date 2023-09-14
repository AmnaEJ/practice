package com.example.practice.DTOS;

public class EmployeeRequestDto {
    private String name;

    public String getName() {
        return name;
    }

    public EmployeeRequestDto setName(String name) {
        this.name = name;
        return this;
    }
}
