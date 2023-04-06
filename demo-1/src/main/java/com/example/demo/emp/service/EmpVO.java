package com.example.demo.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date hireDate;
	String jobId;
	int departmentId;
}
