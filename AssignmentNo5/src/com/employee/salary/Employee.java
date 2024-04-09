package com.employee.salary;

import java.util.Scanner;

public abstract class Employee  {
	private String Fname;
	private String Lname;
	private int SSN;

	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	
	public Employee(String fname, String lname) {
		Fname = fname;
		Lname = lname;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
	 abstract public double calculateSalary();
	public void displayData() {
		System.out.println("First Name :"+Fname);
		System.out.println("Last Name  :"+Lname);
	}
	public void acceptData(Scanner sc) {
		System.out.println("Enter a first name of Employee :");
		Fname=sc.next();
		System.out.println("Enter a Last name of Employee :");
		Lname=sc.next();
	}
}
