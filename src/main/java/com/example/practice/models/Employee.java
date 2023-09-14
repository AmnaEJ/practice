package com.example.practice.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "employee_1")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_name")
    private String name;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(Long id) {
        this.id = id;
    }

    public Employee setId(Long id) {
        this.id = id;
        return this;
    }

}
