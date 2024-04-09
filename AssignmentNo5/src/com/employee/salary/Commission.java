
package com.employee.salary;

import java.util.Scanner;

public class Commission extends Employee {
	private double grossSales;
	private double commissionRate;

	public Commission(String fname, String lname, double grossSales, double commissionRate) {
		super(fname, lname);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;

	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter A GrossSales of Employee :");
		grossSales = sc.nextDouble();
		System.out.println("Enter A Commission Rate of Employee :");
		commissionRate = sc.nextDouble();

	}

	public Commission() {
		super();
	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Total Salary Of Commission :" + calculateSalary());
	}

	@Override
	public double calculateSalary() {

		return (commissionRate * grossSales)/100;
	}

}
