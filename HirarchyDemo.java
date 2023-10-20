package com.inheritence;

class CompLangs {
	public void createNew() {
	System.out.println("learn new langs");	
	}
}
class java extends CompLangs{
	public void createNew1(){
		System.out.println("leaqrn java");
	}
}
class python extends CompLangs{
	public void createNew2()
{
		System.out.println("learn python");
		}
}
public class HirarchyDemo {

	public static void main(String[] args) {
		python obj=new python();
		
		obj.createNew();
		obj.createNew2();
		java ob2=new java();
		ob2.createNew1();
	}

}
