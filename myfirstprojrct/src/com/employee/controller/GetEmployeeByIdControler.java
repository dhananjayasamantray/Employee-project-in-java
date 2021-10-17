package com.employee.controller;

import com.employee.been.EmployeeBeen;
import com.employee.service.impl.EmployeeServiceImpl;

public class GetEmployeeByIdControler {
public static void main(String[] args) {
	int empid =10;
	EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
	EmployeeBeen employeeBeen = employeeServiceImpl.getEmployee(empid);
	int id = employeeBeen.getEmpid();
	String name= employeeBeen.getEmpname();
	String gender= employeeBeen.getEmpgender();
	float salary= employeeBeen.getEmpsalary();
	System.out.println(id);
	System.out.println(name);
	System.out.println(gender);
	System.out.println(salary);
}
}
