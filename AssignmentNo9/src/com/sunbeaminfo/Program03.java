package com.sunbeaminfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {

		// List<Employee> empList = new ArrayList<>();
		// List<Employee> empList = new Vector<>();
		// List<Employee> empList = new LinkedList<>();
//		empList.add(new Employee(5, "abc", 1000));
//		empList.add(new Employee(3, "pqr", 4000));
//		empList.add(new Employee(2, "uvw", 3000));
//		empList.add(new Employee(4, "lmn", 5000));
//		empList.add(new Employee(1, "xyz", 2000));

//		System.out.println("Before Sort - ");
//		for (Employee employee : empList)
//			System.out.println(employee);
//
//		System.out.println("After Natural Ordering --> ");
//		Collections.sort(empList);
//		for (Employee employee : empList)
//			System.out.println(employee);
//
//		System.out.println("Sorting on emp name -->");
//
//		class EmpNameComparator implements Comparator<Employee> {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		}
//
//		Comparator<Employee> empNameComparator = new EmpNameComparator();
//		Collections.sort(empList, empNameComparator);
//
//		for (Employee employee : empList)
//			System.out.println(employee);
//
//		Employee emp = new Employee();
//		emp.id = 3;
//		if (empList.contains(emp.id))
//			System.out.println("Employee exists");
//		else
//			System.out.println("Employee not found");
		int c;
		Scanner sc = new Scanner(System.in);
		Student s;
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(5, "abc", 100));
		s1.add(new Student(3, "pqr", 400));
		s1.add(new Student(2, "uvw", 300));
		class SortByName implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int n= o2.compareTo(o1);
				return n;
			}
			
		}
		class SortByMarks implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int n= Double.compare(o1.getMarks(), o2.getMarks());
				return n;
			}
			
		}
		do {
			System.out.println("0. Exit");
			System.out.println("1. Accept Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Display Specific Student ");
			System.out.println("4. Delete Specific student ");
			System.out.println("5. sort at Roll No ");
			System.out.println("6. Sort by Name");
			System.out.println("7. Sort by marks");
			System.out.println("8. Check if student id present or not");
			System.out.println("Enter your choice :");
			c = sc.nextInt();
			switch (c) {
			case 0:
				System.out.println("Thank you..!!!!!!!");
				break;
			case 1: {
				s = new Student();
				// use try and catch box here
				s.accept();
				s1.add(s);
			}
				break;
			case 2: {
				Iterator<Student> itr = s1.iterator();
				while (itr.hasNext())
					System.out.println(itr.next());
			}
				break;
			case 3: {
				int num;
				System.out.println("Enter Roll number of Student You want to search :");
				num = sc.nextInt();
				Student stu = new Student();
				stu.setRoll_No(num);

				System.out.println(s1.contains(stu));

				if (s1.contains(stu)) {
					System.out.println("Student is in the list ");
				} else {
					System.out.println("Student is not in list");
				}
			}
				break;
			case 4: {
				int num;
				System.out.println("Enter Roll number of Student You want to remove :");
				num = sc.nextInt();
				Student stu = new Student();
				stu.setRoll_No(num);
				s1.remove(stu);
				System.out.println("---------");
			}
				break;
			case 5: {
				Collections.sort(s1);
				for (Student ele : s1)
					System.out.println(ele);

			}
				break;
			case 6:{
				Comparator<Student> d= new SortByName();
				Collections.sort(s1, d);
				for(Student student:s1)
					System.out.println(student);
				
			}
			break;
			case 7:{
				Comparator<Student> k= new SortByMarks();
				Collections.sort(s1, k);
				for(Student student:s1)
					System.out.println(student);
				
			}
				break;
			case 8:{
				int id;
				System.out.println("Enter a specific Student roll number");
				id= sc.nextInt();
				Student j=new Student();
				j.setRoll_No(id);
				if(s1.contains(j)) {
					System.out.println("student is present in list");
				}
			}
			break;
			}
		} while (c != 0);

	}

}
