package com.example.practice;

import com.example.practice.Respository.EmployeeRespository;
import com.example.practice.models.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	private EmployeeRespository employeeRespository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee= new Employee();
	}
}
