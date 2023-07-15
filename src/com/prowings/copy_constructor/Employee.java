package com.prowings.copy_constructor;

public class Employee {
	
	int id;
	String name;
	float sallary;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, float sallary) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
	}
	
	
	
	

}
