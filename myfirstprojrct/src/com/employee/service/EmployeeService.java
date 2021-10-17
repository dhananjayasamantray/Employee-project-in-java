package com.employee.service;

import com.employee.been.EmployeeBeen;

public interface EmployeeService {
public static final int Bonous = 1000;
public abstract void addEmployee(EmployeeBeen employeeBeen);
public abstract void updateEmployee( EmployeeBeen employeeBeen);
public abstract void deleteEmployee(int empid);
public abstract EmployeeBeen getEmployee(int empid);
public abstract  EmployeeBeen[] getAllEmployee();



}
