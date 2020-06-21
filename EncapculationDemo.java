package com.example.oops.demo;
public class EncapculationDemo {
	public static void main(String[] args)
	{
		Account account = new Account();
		account.setBalance(1000);
		System.out.println("Balance is -> "+ account.getBalance());
	}
}

class Account
{
	private	double balance; // Data hiding
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
