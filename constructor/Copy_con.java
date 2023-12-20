package constructor;

public class Copy_con {
int a; String b;
	Copy_con ()
	{
	int a=10; b= " jeet accha bhai ha "; 	
	System.out.println(a +" "+b);
	}
	Copy_con ( Copy_con  ref) 
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
class Jeet
{
	public static void main(String []args) {
		Copy_con r=new Copy_con();
        Copy_con r2 = new Copy_con(r);
	}
}
