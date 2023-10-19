package operators;

public class Compound {

	public static void main(String[] args) {
/*	int a=10;
	int b=20;
	int c=30;
	a+=b;//arithmetic compound oprs
	a-=b;
	a*=b;
	a/=b;
//largest of 3 nos
int max= (a>b && a>c)?a:(b>a && b>c)?b:c;
System.out.println("largest no="+max); */
		
//		int a=100,b=20,c=50,d=30;
//		int max=(a>b && a>c && a>d)?a:
//			(b>a && b>c && b>d)?b:
//				(c>a && c>b && c>d)?c:d;
//		System.out.println("largest of 4 nos is "+max);

		int a=100,b=20,c=50,d=30,e=9000;  //largest of 5 nos
		int max=(a>b && a>c && a>d && a>e)?a:
			(b>a && b>c && b>d && b>e)?b:
				(c>a && c>b && c>d && c>e)?c:
					(d>a && d>b && d>c && d>e)?d:e;
		System.out.println("largest of 5 nos is "+max);
	}

}

