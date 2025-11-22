package com.EmployeeManagement.Project.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.Project.Entity.Employee_Entity;
import com.EmployeeManagement.Project.Repository.Employee_Repository;

@RestController
@RequestMapping("/api/employees")
public class Employee_Controller {

    @Autowired
    private Employee_Repository employeeRepository;

    
    @PostMapping("/add")
    public Employee_Entity addEmployee(@RequestBody Employee_Entity employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee_Entity> updateEmployee(@PathVariable Long id, @RequestBody Employee_Entity newEmp) {
        Optional<Employee_Entity> existingEmp = employeeRepository.findById(id);

        if (existingEmp.isPresent()) {
            Employee_Entity emp = existingEmp.get();

            if (newEmp.getEmp_name() != null) emp.setEmp_name(newEmp.getEmp_name());
            if (newEmp.getEmp_gender() != null) emp.setEmp_gender(newEmp.getEmp_gender());
            if (newEmp.getEmp_email() != null) emp.setEmp_email(newEmp.getEmp_email());
            if (newEmp.getEmp_phone() != null) emp.setEmp_phone(newEmp.getEmp_phone());
            if (newEmp.getEmp_address() != null) emp.setEmp_address(newEmp.getEmp_address());
            if (newEmp.getEmp_dob() != null) emp.setEmp_dob(newEmp.getEmp_dob());
            if (newEmp.getEmp_joining_date() != null) emp.setEmp_joining_date(newEmp.getEmp_joining_date());
            if (newEmp.getEmp_department() != null) emp.setEmp_department(newEmp.getEmp_department());
            if (newEmp.getEmp_designation() != null) emp.setEmp_designation(newEmp.getEmp_designation());
            if (newEmp.getEmp_salary() != 0.0) emp.setEmp_salary(newEmp.getEmp_salary());
            if (newEmp.getEmp_status() != null) emp.setEmp_status(newEmp.getEmp_status());
            if (newEmp.getEmp_nationality() != null) emp.setEmp_nationality(newEmp.getEmp_nationality());
            if (newEmp.getEmp_marital_status() != null) emp.setEmp_marital_status(newEmp.getEmp_marital_status());

            return ResponseEntity.ok(employeeRepository.save(emp));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return ResponseEntity.ok("Employee deleted successfully");
        } else {
            return ResponseEntity.status(404).body("Employee not found");
        }
    }

    
    @GetMapping("/all")
    public List<Employee_Entity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Employee_Entity> getEmployeeById(@PathVariable Long id) {
        Optional<Employee_Entity> emp = employeeRepository.findById(id);
        return emp.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

