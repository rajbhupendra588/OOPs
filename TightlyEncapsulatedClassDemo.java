package com.example.oops.demo;


public class TightlyEncapsulatedClassDemo {
	public static void main(String[] args)
	{
		Account1 account = new Account1();
		account.setBalance(1000);
		System.out.println("Balance is -> "+ account.getBalance());
	}
}

// Note :-  If a class have data member and all data member[s] declared as private then that class is said to be Tightly Encapsulated Class
// In this example variable balance is of type double and access modifier of this variable is private so this class is Tightly Encapsulated Class.

class Account1
{
	private	double balance; // Data hiding
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
