package com.employee.salary;

import java.util.Scanner;

public class salaeried extends Employee {

	private double weeklySalary1;

	public salaeried(String fname, String lname, double weeklySalary1) {
		super(fname, lname);
		this.weeklySalary1 = weeklySalary1;
	} 
	public salaeried() {
		super();
	}



	public double getWeeklySalary1() {
		return weeklySalary1;
	}

	public void setWeeklySalary1(double weeklySalary1) {
		this.weeklySalary1 = weeklySalary1;
	}


	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Weekly Salary of Employee :"+weeklySalary1);

	}

	@Override
	public double calculateSalary() {
		return weeklySalary1;
	}

	@Override
	public void acceptData(Scanner sc) {
		
			super.acceptData(sc);
			System.out.println("Enter weekly salary Of Employee :");
			weeklySalary1 = sc.nextDouble();		
	}
}
