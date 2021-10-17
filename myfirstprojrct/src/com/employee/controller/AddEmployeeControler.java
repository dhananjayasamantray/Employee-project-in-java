package com.employee.controller;

import com.employee.been.EmployeeBeen;


import com.employee.service.impl.EmployeeServiceImpl;

public class AddEmployeeControler {
	public static void main(String[] args) {
		
		int id=100;
		String name="dhana";
		String gender="male";
		float salary=80000.00f;
		 
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		EmployeeBeen employeeBeen = new EmployeeBeen(id,name,gender,salary);
		employeeServiceImpl.addEmployee(employeeBeen);
		
		
	}
}	