package com.credit.limit.check.tester;

import com.credit.limit.check.CreditLimit;

public class LimitTester {
	public static void main(String[] args) {
		CreditLimit cl=new CreditLimit();
		cl.acceptDetails();
		cl.check();
	}

}
