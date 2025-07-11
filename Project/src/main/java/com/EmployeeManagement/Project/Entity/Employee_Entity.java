package com.EmployeeManagement.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee_Entity {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long emp_id;
	
     private String emp_name;
     private String emp_gender;
     private String emp_email;
     private String emp_phone;
     private String emp_address;
     private String emp_dob;
     private String emp_joining_date;
     private String emp_department;
     private String emp_designation;
     private double emp_salary;
     private String emp_status;
     private String emp_nationality;
     private String emp_marital_status;
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_gender() {
		return emp_gender;
	}
	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public String getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(String emp_dob) {
		this.emp_dob = emp_dob;
	}
	public String getEmp_joining_date() {
		return emp_joining_date;
	}
	public void setEmp_joining_date(String emp_joining_date) {
		this.emp_joining_date = emp_joining_date;
	}
	public String getEmp_department() {
		return emp_department;
	}
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	public String getEmp_designation() {
		return emp_designation;
	}
	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_status() {
		return emp_status;
	}
	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}
	public String getEmp_nationality() {
		return emp_nationality;
	}
	public void setEmp_nationality(String emp_nationality) {
		this.emp_nationality = emp_nationality;
	}
	public String getEmp_marital_status() {
		return emp_marital_status;
	}
	public void setEmp_marital_status(String emp_marital_status) {
		this.emp_marital_status = emp_marital_status;
	}
	public Employee_Entity(Long emp_id, String emp_name, String emp_gender, String emp_email, String emp_phone,
			String emp_address, String emp_dob, String emp_joining_date, String emp_department, String emp_designation,
			double emp_salary, String emp_status, String emp_nationality, String emp_marital_status) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_gender = emp_gender;
		this.emp_email = emp_email;
		this.emp_phone = emp_phone;
		this.emp_address = emp_address;
		this.emp_dob = emp_dob;
		this.emp_joining_date = emp_joining_date;
		this.emp_department = emp_department;
		this.emp_designation = emp_designation;
		this.emp_salary = emp_salary;
		this.emp_status = emp_status;
		this.emp_nationality = emp_nationality;
		this.emp_marital_status = emp_marital_status;
	}
	public Employee_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee_Entity [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_gender=" + emp_gender
				+ ", emp_email=" + emp_email + ", emp_phone=" + emp_phone + ", emp_address=" + emp_address
				+ ", emp_dob=" + emp_dob + ", emp_joining_date=" + emp_joining_date + ", emp_department="
				+ emp_department + ", emp_designation=" + emp_designation + ", emp_salary=" + emp_salary
				+ ", emp_status=" + emp_status + ", emp_nationality=" + emp_nationality + ", emp_marital_status="
				+ emp_marital_status + "]";
	}
     
}
