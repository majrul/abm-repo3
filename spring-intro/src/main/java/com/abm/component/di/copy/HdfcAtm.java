package com.abm.component.di.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcAtm-v2")
public class HdfcAtm implements Atm {

	@Autowired
	private List<Bank> banks;
	
	public void withdraw(int acno, double amount) {
		System.out.println("User at HdfcAtm wanting to withdraw " + amount + " rs");
		Bank currentBank = null;
		for(Bank bank : banks) {
			if(bank.isCustomerPresent(acno)) {
				currentBank = bank;
				break;
			}
		}
		currentBank.withdraw(121, acno, amount);
	}

}
