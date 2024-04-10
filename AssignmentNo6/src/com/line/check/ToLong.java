package com.line.check;

import java.util.Scanner;

import com.line.exception.ExceptionLineTooLong;

public class ToLong {
	private String line;

	public ToLong(String line) {
		this.setLine(line);
	}

	public ToLong() {

	}

	public void accept(Scanner sc) {
		System.out.println("Enter Line :");
		line = sc.nextLine(); 
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	public void lenghtCheck() throws ExceptionLineTooLong {
		if(line.length()>8)
			throw new ExceptionLineTooLong("Line Contain more than 80 Charachter ","Line");
	}
}
