package com.example.practice.Service;

import com.example.practice.DTOS.EmployeeGetDto;
import com.example.practice.DTOS.EmployeeRequestDto;
import com.example.practice.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee (EmployeeRequestDto employee);
    List<EmployeeGetDto> getAllEmployee();
    List<Employee> FindByName(String name);
    List<Employee> FindAll();
    List<Employee> findAlLUserSort();
    Employee findByParameter(String name);
    List<Employee> FindByNameIn(List<String> name);
    public int UpdateByName(String name, Long id);







}
