package com.sunbeam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringWordsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string ");
		String s=sc.nextLine();
	int cnt=0;
		/*StringTokenizer str= new StringTokenizer(s);
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			cnt++;
		}
		System.out.println(cnt);*/
		s.trim();
		int  arr=s.split(" ");
		System.out.println(arr);	

	}

}
