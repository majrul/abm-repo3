package com.abm.component.di.copy;

import org.springframework.stereotype.Component;

@Component("iciciBank-v2")
public class IciciBank implements Bank {

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("User of IciciBank wanting to withdraw " + amount + " rs");
	}

	public boolean isCustomerPresent(int acno) {
		if(acno == 22222)
			return true;
		return false;
	}

	
}
