package com.employee.salary;

import java.security.PublicKey;
import java.util.Scanner;

public class Hourly extends Employee {

	private double wage, hours;

	public Hourly() {
		super();
	}

	public Hourly(String fname, String lname, double hours, double wage) {
		super(fname, lname);
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter wage Of Employee :");
		wage = sc.nextDouble();
		System.out.println("Enter hours of Employee :");
		hours = sc.nextDouble();
	}

	@Override
	public double calculateSalary() {
		if(hours<=40) {
			return (wage * this.hours);
		}else if(hours>40) {
			return (40*this.wage)+(hours-40)*this.wage*1.5;
		}
		return 0;
	}
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("wage Of Employee :"+wage);
		System.out.println("Working Hours of Employee :"+hours);
		System.out.println("Salary of Hourly Emp"+calculateSalary());
	}
	}


