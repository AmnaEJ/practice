package com.example.practice.Controller;

import com.example.practice.DTOS.EmployeeGetDto;
import com.example.practice.DTOS.EmployeeRequestDto;
import com.example.practice.Service.EmployeeService;
import com.example.practice.models.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping
public class Employee_Controller {

    private EmployeeService employeeService;

    private Object EmployeeGetDto;

    public Employee_Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/emp")
    public List<EmployeeGetDto> getAllEmployee(){
        return employeeService.getAllEmployee();

    }



    @PostMapping("/post")
    public ResponseEntity<Employee> SaveEmployee(@RequestBody EmployeeRequestDto employee){
         return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);

    }

    @GetMapping("/names")
    @ResponseBody
    public ResponseEntity<List<Employee>> getEmployeeByName
            (@RequestParam(name = "name", required = false) String name){
        List<Employee> employee=employeeService.FindByName(name);
        return  new ResponseEntity(employee, HttpStatus.OK);
    }


    @GetMapping("/find")
    public List<Employee> FindAll(){
          return employeeService.FindAll();
    }
    @GetMapping("/sort")
    public List<Employee> findAlLUserSort(){
        return employeeService.findAlLUserSort();
    }
    @GetMapping("/finds")
     public Employee findByParameter(String name){
        return  employeeService.findByParameter(name);
     }

     @GetMapping("/IN/by-name")

     public ResponseEntity<List<Employee>>FindByNameIn(@RequestParam List<String> name) {
         List<Employee> employees = employeeService.FindByNameIn(name);
         return ResponseEntity.ok(employees);

     }
     @PutMapping("/update/{name}/{id}")
      public ResponseEntity<String> updateUserSetNameForId(@PathVariable String name, @PathVariable Long id)
     {
         return new ResponseEntity<String>(employeeService.UpdateByName(name, id)+" record(s) updated.", HttpStatus.OK);
     }


    //"/api/foos")
   // @ResponseBody
    //public String getFoos(@RequestParam(defaultValue = "AMNA") String name) {
      //  return "Name: " + name;
    //}


    //@GetMapping("/api/foos")
   //@ResponseBody

    //public  String getids(@RequestParam List<String> id){
      //  return "IDs are" + id;
    //}


    //@GetMapping("/api/foos")
    //public String getUser(@RequestParam(value = "name",defaultValue = "AMNA") String name,
      //                    @RequestParam( value = "limits", defaultValue = "1") String limits){

        //  return "the employee name is : " +  name + " "+ "  and the limit is :  " + limits;
    //}


}

