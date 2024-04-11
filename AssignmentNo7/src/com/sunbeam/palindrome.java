package com.sunbeam;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string :");
		String s1=sc.nextLine();
		String rev="";
		for (int i = (s1.length()-1); i >= 0; i--) {
			rev=rev+s1.charAt(i);
		}
		
		if (s1.equals(rev)) {
			System.out.println("String is palindrome !!!");
		}
		else
			System.out.println("String is Not palindrome !!!");
		sc.close();
	}
	
}
