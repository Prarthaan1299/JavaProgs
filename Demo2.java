package com.encapsulation;

class Person{
	private String name;
	private int age;
	


public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}




public String getName() {
	return name;
	
}




public void setName(String name) {
	this.name = name;
}




public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}

}


public class Demo2 {

	

	public static void main(String[] args) {
	
		Person ob=new Person("prarthana" ,24);
		
		System.out.println("name="+ob.getName());
		System.out.println("age="+ob.getAge());
		
		//modify
		ob.setName("Prarthana B M");
		ob.setAge(25);
		System.out.println("modified name="+ob.getName());
		System.out.println("modifies age="+ob.getAge());

	}

}
