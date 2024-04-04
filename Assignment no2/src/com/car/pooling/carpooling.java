package com.car.pooling;

import java.util.Scanner;

public class carpooling {
	private double miles;
	private double costPerGallonGas;
	private double avgMilePerGallon;
	private double parkingFees;
	private double totalToll;
	Scanner sc = new Scanner(System.in);

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getCostPerGallonGas() {
		return costPerGallonGas;
	}

	public void setCostPerGallonGas(double costPerGallonGas) {
		this.costPerGallonGas = costPerGallonGas;
	}

	public double getAvgMilePerGallon() {
		return avgMilePerGallon;
	}

	public void setAvgMilePerGallon(double avgMilePerGallon) {
		this.avgMilePerGallon = avgMilePerGallon;
	}

	public double getParkingFees() {
		return parkingFees;
	}

	public void setParkingFees(double parkingFees) {
		this.parkingFees = parkingFees;
	}

	public double getTotalToll() {
		return totalToll;
	}

	public void setTotalToll(double totalToll) {
		this.totalToll = totalToll;
	}

	public void acceptDetails() {
		System.out.println("Enter Total miles per day you drive :");
		miles = sc.nextDouble();

		System.out.println("Enter per Gallon gasoline :");
		costPerGallonGas = sc.nextDouble();
		
		System.out.println("Enter Avarage mile per Gallon :");
		avgMilePerGallon = sc.nextDouble();
		
		System.out.println("Enter Parking fee  :");
		parkingFees = sc.nextDouble();
		
		System.out.println("Enter total toll fee you spent per day :");
		totalToll = sc.nextDouble();
	}
	public void totalSpent() {
		double total;
		total=miles*(costPerGallonGas/avgMilePerGallon)+parkingFees+totalToll;
		System.out.println("cost of your ride is :"+total);
	}

}
