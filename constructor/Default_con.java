package constructor;

public class Default_con {

	int a; String b; boolean c;
	Default_con(){
		a=100; b="jeet bewakuf ha"; c= true;
	}
	void Disp() {
		System.out.println(a+" "+b+" "+c);
	}
}
class V 
{
	public static void main(String []args){


	Default_con  J=new Default_con();
	J.Disp();
}
}

