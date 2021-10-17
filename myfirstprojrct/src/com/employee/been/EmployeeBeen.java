package com.employee.been;

public class EmployeeBeen {
private int empid;
private String empname;
private String empgender;
private float empsalary;
public EmployeeBeen() {
	
}
public EmployeeBeen(int empid, String empname, String empgender, float empsalary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empgender = empgender;
	this.empsalary = empsalary;
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
public float getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(float empsalary) {
	this.empsalary = empsalary;
}

	

}
