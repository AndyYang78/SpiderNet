package com.spidernet.dashboard.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spidernet.dashboard.service.EmployeeService;


@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Resource 
	EmployeeService userService;
	
	@RequestMapping("/loginPage")
	public String loginPage(final HttpServletRequest request, final HttpServletResponse response) {
		return "login";
	}
	@RequestMapping("/checkUser")
	public String checkUser(final HttpServletRequest request, final HttpServletResponse response) {
		return "index";
	}
	
	
}
