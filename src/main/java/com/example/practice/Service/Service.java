package com.example.practice.Service;

import com.example.practice.DTOS.EmployeeGetDto;
import com.example.practice.DTOS.EmployeeRequestDto;
import com.example.practice.Respository.EmployeeRespository;
import com.example.practice.models.Employee;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements EmployeeService {
   private EmployeeRespository employeeRespository;



    public Service(EmployeeRespository employeeRespository) {
        this.employeeRespository = employeeRespository;
    }


    @Override
    public Employee saveEmployee(EmployeeRequestDto employee) {
        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        return employeeRespository.save(employee1);
    }



    @Override
    public List<EmployeeGetDto> getAllEmployee() {
        Employee employee2 = new Employee();
        employee2.setName(employee2.getName());
        employee2.setId(employee2.getId());
        List<Employee> employees = employeeRespository.findAll();
        List<EmployeeGetDto> employeeGetDtos = new ArrayList<>(0);
        EmployeeGetDto employeeGetDto = null;
        for (Employee employee: employees){
            employeeGetDto = new EmployeeGetDto();
            employeeGetDto.setName(employee.getName());
            employeeGetDto.setId(employee.getId());
            employeeGetDtos.add(employeeGetDto);
        }
        return employeeGetDtos;

    }

    @Override
    public List<Employee> FindByName(String name) {
        return employeeRespository.findByName(name);
    }

    @Override
    public List<Employee> FindAll() {
        return employeeRespository.findAll();
    }

    @Override
    public List<Employee> findAlLUserSort() {
        return employeeRespository.findAlLUserSort(Sort.by("id"));
    }

    @Override
    public Employee findByParameter(String name) {
        return employeeRespository.findByParameter(name);
    }

    @Override
    public List<Employee> FindByNameIn(List<String> name) {
        return employeeRespository.FindByNameIn(name);
    }

    @Override
    public int UpdateByName(String name, Long id) {
        return employeeRespository.updateUserSetNameForId(name,id);
    }

}

