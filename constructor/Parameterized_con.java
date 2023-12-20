package constructor;

public class Parameterized_con {
	int x,y;
	
Parameterized_con(int a, int b)
{
	x=a; y=b;
}
void show() 
{
	System.out.println(x +" "+y );
}
}
class N
{
	public static void main(String []args) {
		Parameterized_con r = new Parameterized_con(100,200);
		r.show();
	}
}