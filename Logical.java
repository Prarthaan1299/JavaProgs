package operators;

public class Logical {

	public static void main(String[] args) {
int x=24;
int y=26;

if(++x > 15 || ++y > 16) // CHECHED ALL &&,||,&,|
{
	x++;
	
}
else {
	y++;
}

System.out.println("x="+x);
System.out.println("y="+y);
	} 

}
