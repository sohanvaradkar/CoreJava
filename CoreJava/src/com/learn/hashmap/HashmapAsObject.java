package com.learn.hashmap;

import java.util.HashMap;

final class Employee 
{
int empid;
String empname;


public Employee(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}

/*
 * public void setEmpid(int empid) { this.empid = empid; }
 */
public String getEmpname() {
	return empname;
}

/*
 * public void setEmpname(String empname) { this.empname = empname; }
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((empname == null) ? 0 : empname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empid != other.empid)
		return false;
	if (empname == null) {
		if (other.empname != null)
			return false;
	} else if (!empname.equals(other.empname))
		return false;
	return true;
}
@Override
public String toString() {
	return "HashmapAsObject [empid=" + empid + ", empname=" + empname + "]";
}


	
}
 
 public class HashmapAsObject
 {
	 public static void main(String[] args) 
	 {
		HashMap< Employee, String> hs=new HashMap<Employee, String>();
		
		Employee ep=new Employee(1, "SOHAN");
		Employee ep1=new Employee(1, "RITESH");
		//ep.setEmpname("RITESH");
		
		hs.put(ep, "obj1");
		hs.put(ep1, "obj2");
		//ep.setEmpname("RITESH");
		System.out.println(hs.toString());
		
	}
 }
