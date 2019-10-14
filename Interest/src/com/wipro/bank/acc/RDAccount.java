package com.wipro.bank.acc;



import com.wipro.bank.acc.Account;

public class RDAccount extends Account {
float r=rateOfInterest/100;
int tn = tenure*12;
	int n=4;
	public RDAccount(int tenure, float principal) {
		this.tenure =tenure;
		this.principal =principal;
	}
	@Override
	public float calculateInterest() {
		
		return principal*(float)(Math.pow(1+(r/n),n*((tn-1)/12.0))-1);
	}

	@Override
	public float calculateAmountDeposited() {
		// TODO Auto-generated method stub
		return principal*tenure*12;
	}


}
