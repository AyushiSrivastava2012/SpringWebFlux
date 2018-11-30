package com.company.engineering.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.company.engineering.entity.Employee;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String>{

}
