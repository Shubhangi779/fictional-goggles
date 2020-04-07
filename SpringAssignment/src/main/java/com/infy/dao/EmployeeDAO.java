package com.infy.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.infy.model.*;


@Component
public class EmployeeDAO {
	
	private static List<EmployeeDto> employee;
	{
		employee = new ArrayList<EmployeeDto>();
		employee.add(new EmployeeDto(101, "John", "Doe", "djohn@gmail.com", "987-678-3456","Technical Analyst"));
		employee.add(new EmployeeDto(102, "Martin", "Smith", "SMartin@gmail.com", "975-635-0368","Team Lead"));
		employee.add(new EmployeeDto(103, "David", "Williams", "WDavid@gmail.com", "703-834-2692","Software Engineer"));
		employee.add(new EmployeeDto(104, "Kate", "Doe", "DKate@gmail.com", "837-996-7498","System Engineer"));
	}
	
	public static List<EmployeeDto> list() {
		return employee;
	}
	
	public EmployeeDto get(Long id) {

		for (EmployeeDto e : employee) {
			if (e.getEmployeeId().equals(id)) {
				return e;
			}
		}
		return null;
	}
}
