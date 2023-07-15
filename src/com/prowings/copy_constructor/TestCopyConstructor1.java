package com.prowings.copy_constructor;

public class TestCopyConstructor1 {
	
	public static void main(String[] args) {
		
		
		Employee employee= new Employee(1234,"Ram",50000.0f);
		
		Company comp1 = new Company(1000,"HSBC", employee);
		
		
		Company comp2 = new Company(comp1);
		
		comp1.employee.name = "Abc";
		comp1.employee.sallary=70000.0f;
	
		
		
		System.out.println(comp1);
		System.out.println(comp2);
		
		
	}

}
