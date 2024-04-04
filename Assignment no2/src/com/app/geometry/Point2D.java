package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	Scanner sc = new Scanner(System.in);

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public Point2D() {
		this(0, 0);
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	public Point2D(int x) {
//		this.x = x;
//	}

	public String getDetails() {
		String a = "(" + x + "," + y + ")";
		return a;
	}

	public void displayPoint() {
		System.out.println("Ponit Details : ("+x+","+y+")");
	}
	public boolean isEqual(Point2D p2) {
		if (this.x == p2.getx() && this.y == p2.gety()) {
			return true;
		}
		return false;

	}

	public void acceptPoint() {
		System.out.println("Enter Point X and Y :");
		x = sc.nextInt();
		y = sc.nextInt();
	}

	public double calculateDistance(Point2D p1) {

		double distance;
		double xdif, ydif;
		xdif = p1.getx() - this.x;
		ydif = p1.gety() - this.y;

		distance = Math.sqrt(Math.pow(2, (p1.x - this.x)) + Math.pow(2, (p1.y - this.y)));
		return distance;

	}

}
