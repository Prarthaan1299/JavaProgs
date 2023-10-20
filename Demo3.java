package com.encapsulation;

class Bank1{
	static String branchname;
	private String bankname="SBI";
	private String name ;
	private String Accno;
	private String ifsc;
	private double balance;

	
public void branchname() {
	System.out.println("Branchname=BANGALORE BRANCH");
}
	

	
	//constructor
	public String getAccno() {
		return Accno;
	}

	public Bank1(String bankname, String name, String accno, String ifsc, double balance) {
		super();
		this.bankname = bankname;
		this.name = name;
		Accno = accno;
		this.ifsc = ifsc;
		this.balance = balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccno(String accno) {
		Accno = accno;
	}
//user methods
	public double deposit (double amount) {
		return balance+=amount;
	}
	
	public double withdrawal (double amount) {
	if(balance<amount) {
		System.out.println("sorry! insufficient balance");
		
	}
	else {
		System.out.println("thanks");
		
	}
	
	return balance-=amount;	
}
}

public class Demo3 {

	public static void main(String[] args) {
		
		
		Bank1 ob=new Bank1("SBI","Prarthana","sbi789","SBI812",20000);
		ob.branchname();
		System.out.println(ob.getBankname());
		System.out.println(ob.getName());
		System.out.println(ob.getAccno());
		System.out.println(ob.getIfsc());
		System.out.println(ob.getBalance());
		System.out.println("deposit="+ob.deposit(3000));
		System.out.println("after withdrawal="+ob.withdrawal(2000));
		
		System.out.println();
		
		Bank1 ob1=new Bank1("SBI","mohit","sbi189","SBI892",40000);
		ob1.branchname();
		System.out.println(ob1.getBankname());
		System.out.println(ob1.getName());
		System.out.println(ob1.getAccno());
		System.out.println(ob1.getIfsc());
		System.out.println(ob1.getBalance());
		System.out.println("deposit="+ob1.deposit(7000));
		System.out.println("after withdrawal="+ob1.withdrawal(2000));

	}

}

	
