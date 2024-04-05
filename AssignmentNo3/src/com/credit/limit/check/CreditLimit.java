
package com.credit.limit.check;
import java.util.Scanner;

public class CreditLimit {
	private double accountNo;
	private double pendingBalanceAtBeginingMonth;
	private double totalSpendOfMonth;
	private double allowedCreditLimit;
	private double totalCreditAppliedThisMonth;
	Scanner sc=new Scanner(System.in);
	public double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}

	public double getPendingBalanceAtBeginingMonth() {
		return pendingBalanceAtBeginingMonth;
	}

	public void setPendingBalanceAtBeginingMonth(double pendingBalanceAtBeginingMonth) {
		this.pendingBalanceAtBeginingMonth = pendingBalanceAtBeginingMonth;
	}

	public double getTotalSpendOfMonth() {
		return totalSpendOfMonth;
	}

	public void setTotalSpendOfMonth(double totalSpendOfMonth) {
		this.totalSpendOfMonth = totalSpendOfMonth;
	}

	public double getAllowedCreditLimit() {
		return allowedCreditLimit;
	}

	public void setAllowedCreditLimit(double allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}

	public double getTotalCreditAppliedThisMonth() {
		return totalCreditAppliedThisMonth;
	}

	public void setTotalCreditAppliedThisMonth(double totalCreditAppliedThisMonth) {
		this.totalCreditAppliedThisMonth = totalCreditAppliedThisMonth;
	}
	public void acceptDetails() {
		
		System.out.println("Enter Account Number :");
		accountNo=sc.nextDouble();
		
		System.out.println("Enter pending balance at the beginning of the month :");
		pendingBalanceAtBeginingMonth=sc.nextDouble();
		
		System.out.println("Enter total of all items charged by the customer this month :");
		totalSpendOfMonth=sc.nextDouble();
		
		System.out.println("Enter total of all credits applied to the customer’s account this month :");
		totalCreditAppliedThisMonth=sc.nextDouble();
		
		System.out.println("Enter allowed credit limit :");
		allowedCreditLimit=sc.nextDouble();
	}
	public double calculateNewBalance() {
		return allowedCreditLimit-(pendingBalanceAtBeginingMonth+totalSpendOfMonth-totalCreditAppliedThisMonth) ;
	}
	public void check() {
		if(allowedCreditLimit>calculateNewBalance()) {
			System.out.println(calculateNewBalance());
		}
		else {
			System.out.println("Credit Limit is Exceeded!!!!");
		}
	}
}
