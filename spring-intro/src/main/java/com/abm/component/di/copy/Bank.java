package com.abm.component.di.copy;

public interface Bank {

	public boolean isCustomerPresent(int acno);
	
	public void withdraw(int atmId, int acno, double amount);

}
