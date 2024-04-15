package com.sunbeaminfo;

import java.util.Objects;
import java.util.Scanner;

public class Student implements Acceptble,Comparable<Student>{
	Scanner sc= new Scanner(System.in);
private int roll_No;
private String name;
private double marks;
public int getRoll_No() {
	return roll_No;
}
public void setRoll_No(int roll_No) {
	this.roll_No = roll_No;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public Student(int roll_No, String name, double marks) {
	this.roll_No = roll_No;
	this.name = name;
	this.marks = marks;
}
public Student() {
}
@Override
public void accept() {
	System.out.println("Enter A roll number :");
	roll_No=sc.nextInt();
	System.out.println("Enter a Name of Student :");
	name=sc.next();
	System.out.println("Enter a Marks of Student :");
	marks=sc.nextDouble();
}

//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (!(obj instanceof Student))
//		return false;
//	Student other = (Student) obj;
//	return roll_No == other.roll_No;
//}
@Override
public String toString() {
	return "Student [roll_No=" + roll_No + ", name=" + name + ", marks=" + marks + "]";
}
@Override
public int compareTo(Student o) {
	return this.roll_No-o.roll_No;
}
}
