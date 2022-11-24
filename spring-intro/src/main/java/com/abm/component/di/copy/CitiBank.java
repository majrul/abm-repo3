package com.abm.component.di.copy;

import org.springframework.stereotype.Component;

@Component("citiBank-v2")
public class CitiBank implements Bank {

	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("User of CitiBank wanting to withdraw " + amount + " rs");
	}

	public boolean isCustomerPresent(int acno) {
		if(acno == 11111)
			return true;
		return false;
	}

	
}
