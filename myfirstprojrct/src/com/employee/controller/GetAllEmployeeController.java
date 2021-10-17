package com.employee.controller;

import com.employee.been.EmployeeBeen;

import com.employee.service.impl.EmployeeServiceImpl;

public class GetAllEmployeeController {
public static void main(String[] args) {
	EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
	EmployeeBeen[] employeeBeenArray = employeeServiceImpl.getAllEmployee();
	for(int i=0;i<employeeBeenArray.length;i++) {
		EmployeeBeen employeeBeen = employeeBeenArray[i];
		int id = employeeBeen.getEmpid();
		String name = employeeBeen.getEmpname();
		String gender= employeeBeen.getEmpgender();
		float salary= employeeBeen.getEmpsalary();
		System.out.println(id);
	}
	
}}
