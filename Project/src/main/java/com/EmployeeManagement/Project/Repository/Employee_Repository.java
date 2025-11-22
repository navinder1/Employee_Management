package com.EmployeeManagement.Project.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.Project.Entity.Employee_Entity;

public interface Employee_Repository extends JpaRepository<Employee_Entity, Long>{

	Optional<Employee_Entity> findById(Long id);

	boolean existsById(Long id);

	void deleteById(Long id);

}
