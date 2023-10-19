package operators;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("fir num=");
int a=sc.nextInt();
System.out.println("sec num=");
float b=sc.nextFloat();
System.out.println("third num=");
float c=sc.nextFloat();
float d=a+b+c;
System.out.println("sum="+d);


	}

}
