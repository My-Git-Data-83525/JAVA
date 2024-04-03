package com.app.tester;

import com.app.geometry.*;


import java.util.Scanner;

public class TestPoint  {

	public static void main(String[] args) {
		int X,Y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Point X and Y :");
		X=sc.nextInt();
		Y=sc.nextInt();
		Point2D p1 = new Point2D(X, Y);
		System.out.println("Enter Point A and B :");
		int A=sc.nextInt();
		int B=sc.nextInt();
		Point2D p = new Point2D(A,B);
		//Point2D p2=new Point2D(5);
		//Point2D p3=new Point2D();
		boolean b=p1.isEqual(p);
		if(b) {
			System.out.println("Points are where Same so we can not able to find distance between two points ! ");
		}
		else {
		
		//System.out.println(b);
		System.out.println("IS two points are equal : "+b);
		double d=p1.calculateDistance(p);
		System.out.println("Distance Between Two points : "+d);
		
		System.out.println(p1.getDetails());
		System.out.println(p.getDetails());
		}
		//System.out.println(p2.getDetails());

		
	}

}
