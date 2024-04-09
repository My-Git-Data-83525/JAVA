package com.employee.salary;

import java.util.Scanner;

public class BasePlusComm extends Commission {
private double baseSalary;

	public BasePlusComm(String fname, String lname, double grossSales, double commissionRate) {
		super(fname, lname, grossSales, commissionRate);

	}
@Override
public void acceptData(Scanner sc) {
	super.acceptData(sc);
	System.err.println("Enter a base Salary of Employee :");
	baseSalary=sc.nextDouble();
}
@Override
public void displayData() {
	super.displayData();
	System.out.println("Salary Base reward :"+baseSalary);
}

public void baseSalary() {
	System.out.println("Salary After Commission And reward :"+((getCommissionRate()*getGrossSales())/100+ baseSalary+(baseSalary*10)/100));
}
	public BasePlusComm() {
	}

}
