package com.devzigma.httpdatacompression.controller;

import com.devzigma.httpdatacompression.domain.Employee;
import com.devzigma.httpdatacompression.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/api/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
