package com.inheritence;

class GrandPa{
	public void property() {
		System.out.println("has a,b,c");
	}
}
class Parent1 extends GrandPa {
	public void property1() {
		System.out.println("gets a,b,c and also makes d");
	}
}
class Child1 extends Parent1{
	public void property2() {
		System.out.println("gets a,b,c,d");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Child1 ob=new Child1();
	ob.property();
	ob.property1();
	ob.property2();

	}

}
