package com.infy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fc")
public class EmployeeController {
	@RequestMapping(method = RequestMethod.GET)
	public String display() {
		System.out.println("******Display method");
		return "one";
	}

}
