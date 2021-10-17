package com.employee.dao;


import com.employee.entity.EmployeeEntity;

public interface EmployeeDao {
	public static final int Bonous = 1000;
	public abstract void addEmployee(EmployeeEntity employeeEntity);
	public abstract void updateEmployee( EmployeeEntity employeeEntity);
	public abstract void deleteEmployee(int empid);
	public abstract EmployeeEntity getEmployee(int empid);
	public abstract  EmployeeEntity[] getAllEmployee();
}
