package com.abstraction;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b;

b = new SBIBank();
System.out.println("Rate of interest for sbi is "+ b.getRateOfinterest());

b = new HDFCBANK();
System.out.println("Rate of interest for hdfc is "+ b.getRateOfinterest());
	}

}
