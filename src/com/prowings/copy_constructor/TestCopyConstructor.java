package com.prowings.copy_constructor;

public class TestCopyConstructor {
	
	public static void main(String[] args) {
		
		Address  address = new Address(1234,"Pune","India");
		
		Student std1 = new Student(101,"Ram",address);
		
		
		Student std2 =  new Student(std1);
		
		std1.address.city = "Mumbai";
		std1.address.country = "USA";
		std1.address.pin = 5678;
		
		
		System.out.println(std1);
		System.out.println(std2);
		
		
		
		
		
		
	}

}
