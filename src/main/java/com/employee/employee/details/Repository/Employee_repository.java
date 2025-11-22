package com.employee.employee.details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employee.details.Entity.Employee_Entity;


@Repository
public interface Employee_repository extends JpaRepository<Employee_Entity, Long> {
}
