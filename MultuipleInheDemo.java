package com.interfacedemo;

interface Parent1{
	abstract  void parentMethod1();
}
interface Parent2{
	abstract void parentMethod2();
}

class Child implements Parent1,Parent2{ //ond class ond interface anta idreuse implements
	@Override
public void parentMethod2() {
	System.out.println("child class extending with parent2");
}

@Override
public void parentMethod1() {
	// TODO Auto-generated method stub
	System.out.println("child class extending with parent1");
}
}
public class MultuipleInheDemo {

	public static void main(String[] args) {
		//we cannot create ob for parent1 and parent2 coz we cannot create object for interface
Child ob=new Child();
ob.parentMethod1();
ob.parentMethod2();


	}

}
