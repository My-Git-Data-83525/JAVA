package com.app.tester;

import com.app.geometry.*;

import java.util.Iterator;
import java.util.Scanner;

public class TestPoint2 {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of points you want ");
		n = sc.nextInt();
		Point2D[] pointArray = new Point2D[n];
		for(int i=0;i<pointArray.length;i++) {
			pointArray[i]=new Point2D();
			pointArray[i].acceptPoint();//accept values at index
		}
//		for(Point2D ref:pointArray)
//			ref.acceptPoint();
		/*
		 * 1. Display details of a specific point User i/p : index O/p : x & y
		 * co-ordinates should be displayed. or error message(eg : Invalid index , pls
		 * retry!!!!) 2) Display x, y co-ordinates of all points Hint : for-each 3) User
		 * i/p : 2 indices for the points , validate the indices Display distance
		 * between specified points (iff they are not located at the same position) eg :
		 * sop("Enter index of strt point n end point"); validation : boundary condition
		 * (0<=index<length-1) isEqual -- false --compute distance --display it. 4. Exit
		 */
		do {

			System.out.println("1. Display details at index :");
			System.out.println("2. Display Point Details of all the points");
			System.out.println("3. Display Distance between Specific Points ");
			System.out.println("0. Exit");
			System.out.println("Enter Your choice :");
			n = sc.nextInt();
			switch (n) {
			case 1: {
				int i;
				System.out.println("Enter index that you want to print :");
				i = sc.nextInt();
				if(i>pointArray.length) {
					System.out.println("Invalid index");
				}
				else {
				pointArray[i].displayPoint();
				}
//				for (int j = 0; j < pointArray.length; j++) 
//				{
//					if (i == j)
//						pointArray[j].displayPoint();
//				}
			}
				break;
			case 2: 
			{
				for(Point2D element:pointArray) {
					element.displayPoint();
				}
			}
				break;
			case 3:
			{
				int a,b;
				System.out.println("enter index that you want to calculate distance between :");
				a=sc.nextInt();
				b=sc.nextInt();
				if(!pointArray[a].isEqual(pointArray[b]))
				{
					double c=pointArray[a].calculateDistance(pointArray[b]);
					System.out.println("Distance between two points :"+c);
				}
				else
				{
					System.out.println("the values of both points are same so we can't find the values");
				}
				
			}
				

			case 4:
				System.out.println("Thank you!!!!!!!");
				break;
			}
		} while (n != 0);

//		Point2D p1 = new Point2D(X, Y);
//		System.out.println("Enter Point A and B :");
//		int A=sc.nextInt();
//		int B=sc.nextInt();
//		Point2D p = new Point2D(A,B);
//		//Point2D p2=new Point2D(5);
//		//Point2D p3=new Point2D();
//		boolean b=p1.isEqual(p);
//		if(b) {
//			System.out.println("Points are where Same so we can not able to find distance between two points ! ");
//		}
//		else {
//		
//		//System.out.println(b);
//		System.out.println("IS two points are equal : "+b);
//		double d=p1.calculateDistance(p);
//		System.out.println("Distance Between Two points : "+d);
//		
//		System.out.println(p1.getDetails());
//		System.out.println(p.getDetails());
//		}
//		//System.out.println(p2.getDetails());

	}

}

