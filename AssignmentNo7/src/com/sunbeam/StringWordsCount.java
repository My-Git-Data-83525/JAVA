package com.sunbeam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringWordsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string ");
		String s=sc.nextLine();
	int cnt=0;
//		StringTokenizer str= new StringTokenizer(s);
//		while(str.hasMoreTokens()) {
//			System.out.println(str.nextToken());
//			cnt++;
//		}
		System.out.println(cnt);
		s.trim();
		String  arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>0) {
				cnt++;
			}
		}
		System.out.println(arr);
//		

	}

}
