package com.prowings.copy_constructor;

public class Student {
	
	int rollno;
	String name;
	Address address;
	
	public Student() {
		super();
	}

	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public Student(Student std) {    // copy constructor
		
		this.rollno = std.rollno;
		this.name = std.name;
		
//		this.address=std.address;    // shallow copy
		
		Address cloneaddress = new Address();
		
		cloneaddress.pin = std.address.pin;
		cloneaddress.city = std.address.city;
		cloneaddress.country = std.address.country;
		
		this.address = cloneaddress;    // Deep copy
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
