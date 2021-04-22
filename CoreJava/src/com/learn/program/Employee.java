package com.learn.program;

public class Employee implements Comparable<Employee>
{
int empid;
String empName;
double salary;

public Employee(int empid, String empName, double salary) {
	//super();
	this.empid = empid;
	this.empName = empName;
	this.salary = salary;
}

@Override
public int compareTo(Employee emp) {  
    return - empName.compareTo(emp.empName);  
      
  }



public int getEmpid() {
	return empid;
}



public void setEmpid(int empid) {
	this.empid = empid;
}



public String getEmpName() {
	return empName;
}



public void setEmpName(String empName) {
	this.empName = empName;
}



public double getSalary() {
	return salary;
}



public void setSalary(double salary) {
	this.salary = salary;
}


}
