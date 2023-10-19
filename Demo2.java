package Constructor;

public class Demo2 {
	String name; //default value -null for instance var
	int rollno; //def value-0
	
	Demo2 (String name,int rollno) //parameterized constr
	{
	this.name=name;
	this.rollno=rollno;//this keyword usedto access properties from current class
	}
	//class A extends Demo2(String name,int rollno){
		//super.name=name;
		
		
	//}
	public static void main(String[] args) {
	Demo2 ob=new Demo2("ashika",102)	;
	System.out.println(ob.name);
	System.out.println(ob.rollno);

	}

}
