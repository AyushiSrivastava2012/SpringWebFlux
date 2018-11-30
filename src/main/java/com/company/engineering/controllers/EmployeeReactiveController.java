package com.company.engineering.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.engineering.entity.Employee;
import com.company.engineering.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeReactiveController {

	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping("/{id}")
	private Mono<Employee> getEmployeeById(@PathVariable String id) {
	    return repo.findById(id);
	}
	
	@PostMapping("/save")
	private Mono<Employee> updateEmployee(@RequestBody Employee employee) {
	    return repo.save(employee);
	}
	
	@GetMapping
	private Flux<Employee> getAllEmployees() {
	    return repo.findAll();
	}
	
}
