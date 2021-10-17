package com.employee.service.impl;

import com.employee.been.EmployeeBeen;


import com.employee.dao.impl.EmployeeDaoImpl;
import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void addEmployee(EmployeeBeen employeeBeen) {
		// TODO Auto-generated method stub
		int id=100;
		String name="dhana";
		String gender="male";
		float salary=80000.00f;
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity = new EmployeeEntity(id,name,gender,salary);
		employeeDaoImpl.addEmployee(employeeEntity);
	}

	@Override
	public void updateEmployee(EmployeeBeen employeeBeen) {
		// TODO Auto-generated method stub
		int id=100;
		String name="dhana";
		String gender="male";
		float salary=80000.00f;
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity = new EmployeeEntity(id,name,gender,salary);
		employeeDaoImpl.updateEmployee(employeeEntity);
		
	}

	@Override
	public void deleteEmployee(int empid) {
			System.out.println("empid="+empid);
			EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
			employeeDaoImpl.deleteEmployee(empid);
	}

	@Override
	public EmployeeBeen getEmployee(int empid) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity=employeeDaoImpl.getEmployee(empid);
		int id= employeeEntity.getEmpid();
		String name=employeeEntity.getEmpname();
		String gender= employeeEntity.getEmpgender();
		float salary = employeeEntity.getEmpsalry();
		EmployeeBeen employeeBeen = new EmployeeBeen(id,name,gender,salary);
		return employeeBeen;
	}

	@Override
	public EmployeeBeen[] getAllEmployee() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		EmployeeEntity[] employeeEntityArray = employeeDaoImpl.getAllEmployee();
		EmployeeBeen[] employeeBeenArrray= new EmployeeBeen[employeeEntityArray.length];
				for(int i=0;i<employeeBeenArrray.length;i++) {
		EmployeeEntity employeeEntity = employeeEntityArray[i];
		int id= employeeEntity.getEmpid();
		String name=employeeEntity.getEmpname();
		String gender= employeeEntity.getEmpgender();
		float salary = employeeEntity.getEmpsalry();
		EmployeeBeen EmployeeBeen = new EmployeeBeen(id,name,gender,salary);
		employeeBeenArrray[i]=EmployeeBeen;
				}
		return employeeBeenArrray;

	}
	
	}

