package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dao.EmployeeDAO;
import com.infy.model.EmployeeDto;


@RestController
@RequestMapping("/data")
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping("/demo")
	public String displayMsg() {
		return "REST API in Spring MVC implemented java based Configuration";
	}
	
	@GetMapping("/employee")
	public List<EmployeeDto> getEmployeeId() {
		return EmployeeDAO.list();
	}

}
