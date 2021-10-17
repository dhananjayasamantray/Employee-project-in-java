package com.employee.dao.impl;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		int id= employeeEntity.getEmpid();
		String name =employeeEntity.getEmpname();
		String gender = employeeEntity.getEmpgender();
		float salary= employeeEntity.getEmpsalry();
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
	}

	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) {
		int id = employeeEntity.getEmpid();
		String name=employeeEntity.getEmpname();
		String gender=employeeEntity.getEmpgender();
		float salary= employeeEntity.getEmpsalry();
		System.out.println("id="+id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		System.out.println("emp id="+empid);
		
	}

	@Override
	public EmployeeEntity getEmployee(int empid) {
		int id=10;
		String name="dhana";
		String gender= "male";
		float salary= 40000.00f;
		EmployeeEntity employeeEntity = new EmployeeEntity(id,name,gender,salary);

		return employeeEntity;
	}

	@Override
	public EmployeeEntity[] getAllEmployee() {
		int id=12;
		String name = "dhananjaya";
		String gender= "male";
		float salary =4000.00f;
		EmployeeEntity employeeEntity =new EmployeeEntity(id,name,gender,salary);
		int id1 = 121;
		String name1="dj";
		String gender1="male";
		float salary1 =4000.00f;
		EmployeeEntity employeeEntity1 =new EmployeeEntity(id,name,gender,salary);
		EmployeeEntity[] employeeEntityArray = {employeeEntity,employeeEntity1};
		return  employeeEntityArray;
	}
	

	
	

}
