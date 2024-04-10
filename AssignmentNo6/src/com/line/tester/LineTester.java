package com.line.tester;
 
import java.util.Scanner;

import com.line.check.ToLong;
import com.line.exception.ExceptionLineTooLong;

public class LineTester {
	ToLong tl= new ToLong();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ToLong tl= new ToLong();
	
		try {
			tl.accept(sc);
			tl.lenghtCheck();
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		System.out.println(tl.getLine().length());
		
	}

}
