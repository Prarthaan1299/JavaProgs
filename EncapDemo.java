package com.encapsulation;

public class EncapDemo {
private double balance;

	
	public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


	public static void main(String[] args) {
		EncapDemo ob=new EncapDemo();
		ob.setBalance(10000);
		
		System.out.println(ob.getBalance());

	}

}
