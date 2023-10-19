package operators;

public class Ternary {

	public static void main(String[] args) {
		

	
	int a=10;
	int b=20;
	int c;
	c=(a<b)?a:b;
	System.out.println(c);
	int x=50;
	int y=60;
	
	int z;
	z=(x>y)?x:(y<x)?y:x;
	System.out.println(z);

}
}