package com.inheritence;

class Raj{
	public void properties(){
		System.out.println("Has all power");
	}
}
class Yuvaraj extends Raj{
	public void details() {
		System.out.println("will get power from Raj");
	}
}
public class SingleInh {

	public static void main(String[] args) {
		Yuvaraj ob=new Yuvaraj();
		ob.properties();
		ob.details();
		

	}

}
