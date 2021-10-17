package com.employee.entity;

public class EmployeeEntity {
private int empid;
private String empname;
private String empgender;
private float empsalry;
 
public EmployeeEntity() {
	
}

public EmployeeEntity(int empid, String empname, String empgender, float empsalry) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empgender = empgender;
	this.empsalry = empsalry;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmpgender() {
	return empgender;
}

public void setEmpgender(String empgender) {
	this.empgender = empgender;
}

public float getEmpsalry() {
	return empsalry;
}

public void setEmpsalry(float empsalry) {
	this.empsalry = empsalry;
}

}
