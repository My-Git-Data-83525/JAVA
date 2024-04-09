package com.employee.salary;

import java.util.*;

public class salarytester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. To Calculate Fixed salary ");
		System.out.println("2. To calculate Hourly Salary");
		System.out.println("3. To calculate Employee Commission");
		System.out.println("4. To Calculate Base Salary");
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		switch (n) {
		case 1: {

			Employee e1 = new salaeried();
			e1.acceptData(sc);
			e1.displayData();
		}

			break;
		case 2: {
			Employee e1 = new Hourly();
			e1.acceptData(sc);
			e1.displayData();
		}

			break;
		case 3: {
			Employee e1 = new Commission();
			e1.acceptData(sc);
			e1.displayData();
		}

			break;
		case 4: {
			Employee e1 = new BasePlusComm();
			BasePlusComm b1=(BasePlusComm)e1;
			b1.acceptData(sc);
			b1.displayData();
			b1.baseSalary();
		}
			break;
		default:
			System.out.println("Enter A correct choice ");
			break;
		}
	}

}
