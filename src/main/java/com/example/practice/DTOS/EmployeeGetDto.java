package com.example.practice.DTOS;

public class EmployeeGetDto {
    private String name;
    private Long id;

    public Long getId() {
        return id;
    }

    public EmployeeGetDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeGetDto setName(String name) {
        this.name = name;
        return this;
    }
}
