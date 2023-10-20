package com.interfacedemo;

//base class
class Animal{
	void eat()
	{
		System.out.println("it can eat");
	}
}

interface swimmer{
	void swim();
}
interface flyer{
	void fly();
}

class Fish extends Animal implements swimmer{
	public void swim() {
		System.out.println("it can swim");
	}
}
class Bird extends Animal implements flyer{
	public void fly() {
		System.out.println("it can fly");
	}
}


public class HybridInh {

	public static void main(String[] args) {
		Fish ob=new Fish();
		ob.swim();
Bird ob1=new Bird();
ob1.fly();
	}

}
