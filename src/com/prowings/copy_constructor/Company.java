package com.prowings.copy_constructor;

public class Company {

	int noofemployee;
	String name;
	Employee employee;
	
	public Company() {
		super();
	}

	public Company(int noofemployee, String name, Employee employee) {
		super();
		this.noofemployee = noofemployee;
		this.name = name;
		this.employee = employee;
	}
	
	public Company(Company company) {    // copy constructor
		
		this.noofemployee = company.noofemployee;
		this.name = company.name;
		
//		this.employee = employee;  // shallow copy
		
		Employee clonedempolyee = new Employee();
		
		clonedempolyee.id = company.employee.id;
		clonedempolyee.name = company.employee.name;
		clonedempolyee.sallary= company.employee.sallary;
		
		this.employee = clonedempolyee;      // Deep copy
		
		
	}

	@Override
	public String toString() {
		return "Company [noofemployee=" + noofemployee + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
	
	
	
}
