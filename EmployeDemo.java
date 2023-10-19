package Constructor;

public class EmployeDemo {
	String emp_name;
	int emp_id;
	int emp_age;
	String emailid;
	long mobile;
	
	EmployeDemo(String emp_name,int emp_id,int emp_age,String emailid,long mobile)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.emp_age=emp_age;
		this.emailid=emailid;
		this.mobile=mobile;
	}
	public static void main(String[] args) {
		EmployeDemo ob=new EmployeDemo("ravi",101,23,"ravi1899@gmail.com",1234567891);
		System.out.println(ob.emp_name);
		System.out.println(ob.emp_id);
		System.out.println(ob.emp_age);
		System.out.println(ob.emailid);
		System.out.println(ob.mobile);
		
		System.out.println("  ");
		
		EmployeDemo ob1=new EmployeDemo("manu",102,25,"manu1234@gmail.com",9148347831l);
		System.out.println(ob1.emp_name);
		System.out.println(ob1.emp_id);
		System.out.println(ob1.emp_age);
		System.out.println(ob1.emailid);
		System.out.println(ob1.mobile);
		
		
	}

}
