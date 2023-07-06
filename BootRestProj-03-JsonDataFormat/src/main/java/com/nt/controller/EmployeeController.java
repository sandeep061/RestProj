package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;
import com.nt.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
 
	@GetMapping("/data")
	public ResponseEntity<Employee> getAll(){
	   
		Customer cst=new Customer(111, new String[] {"Black","green"}, List.of("babu","babul","raj","moharaj"), Map.of("Adhara",676234564L,"pan",8734784L));
		Employee emp=new Employee(101, "BABU", "PAHANGA", 9999.0,cst
				                                                );
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
}
