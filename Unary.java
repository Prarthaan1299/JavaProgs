package operators;

public class Unary {
//post in opr--assign value first
	// --then change value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=++x;
System.out.println("x=10");
System.out.println(y);
System.out.println(x);
 
int a=20;
int z=a++;
System.out.println("a=20");
System.out.println(z);
System.out.println(a);

int b=30;
int c=--b;
System.out.println("b=30");
System.out.println(c);
System.out.println(b);

int g=40;
int h=g--;
System.out.println("g=40");
System.out.println(h);
System.out.println(g);
	}

}
