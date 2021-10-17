package com.employee.controller;

import com.employee.service.impl.EmployeeServiceImpl;

public class DeleteEmployeeControler {
	public static void main(String[] args) {
		
	
int empid = 10;
EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
employeeServiceImpl.deleteEmployee(empid);
   
}
}