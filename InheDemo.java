package com.inheritence;
class Parent {
	public void properties() {
		System.out.println("abc");
	}
}
class Child extends Parent{
	public void details() {
	System.out.println("xyz");
}
	}

public class InheDemo {
	
	public static void main(String[] args) {
		Child ob=new Child();
		ob.properties();
		ob.details();
		
//		Parent ob1=new Parent();// parent ge if v create object v can access only parent class
//		ob1.properties();
		

	}}


