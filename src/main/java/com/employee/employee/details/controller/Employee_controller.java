package com.employee.employee.details.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.details.Entity.Employee_Entity;
import com.employee.employee.details.Repository.Employee_repository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employees")
public class Employee_controller {

    @Autowired
    private Employee_repository E_repo;

    @PostMapping("/add")
    public Employee_Entity addEmployee(@RequestBody Employee_Entity employee) {
        return E_repo.save(employee);
    }

    @GetMapping("/fetch")
    public List<Employee_Entity> getAllEmployees() {
        return E_repo.findAll();
    }

    @PutMapping("/update/{id}")
    public Employee_Entity updateEmployee(@PathVariable Long id, @RequestBody Employee_Entity updatedEmployee) {
        Optional<Employee_Entity> optionalEmp = E_repo.findById(id);

        if (optionalEmp.isPresent()) {
            Employee_Entity existingEmployee = optionalEmp.get();
            existingEmployee.setFull_name(updatedEmployee.getFull_name());
            existingEmployee.setEmail(updatedEmployee.getEmail());
            return E_repo.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee with ID " + id + " not found.");
        }
    }
}
