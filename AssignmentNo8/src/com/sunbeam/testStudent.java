package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class testStudent {

	public static void main(String[] args) {
		Student sArr[] = new Student[5];
		sArr[0] = new Student(12, "Nagesh", "Pune", 70.58);
		sArr[1] = new Student(3, "Jack", "Berlin", 68.90);
		sArr[2] = new Student(40, "Sunny", "Mosco", 78.90);
		sArr[3] = new Student(1, "Afreen", "Pak", 96.41);
		sArr[4] = new Student(6, "Ramlal", "Sangli", 80.21);

		System.out.println("Student before sotring :");
		for (Student ele : sArr)
			System.out.println(ele);
		class CompareCity implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int a= o1.getCity().compareTo(o2.getCity());
				return a;
			}
			
		}
		class CompareMarks implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int a=Double.compare(o2.getMarks(), o1.getMarks());
				return a;
			}
			
		}
		class CompareName implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				int a=o1.getName().compareTo(o2.getName());
				return a;
			}
			
		}
		int n;
		Student s=new Student();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit");
			System.out.println("1. sorted on their city (asc)");
			System.out.println("2. sorted on their on marks (desc)");
			System.out.println("3. sorted on their on name (asc)");
			System.out.println("Enter your choice :");
			n = sc.nextInt();
			
			switch (n) {
			case 0:
				System.out.println("Thank you!!!");
				break;
			case 1: {
				Comparator<Student> SnameComp= new CompareName();
				Arrays.sort(sArr,SnameComp);
				for (Student ele : sArr)
					System.out.println(ele);
			}
				break;
			case 2: {
				Comparator<Student> SmarkComp= new CompareMarks();
				Arrays.sort(sArr,SmarkComp);
				for (Student ele : sArr)
					System.out.println(ele);

			}
				break;
			case 3:{
				Comparator<Student> SmarkComp= new CompareMarks();
				Arrays.sort(sArr,SmarkComp);
				for (Student ele : sArr)
					System.out.println(ele);
			} 
				
				break;

			default:
				break;
			}
		} while (n != 0);
	}

}
