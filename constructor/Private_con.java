package constructor;
public class Private_con {
	
	int a; double b; String c;
	 private Private_con()
	{
		a=10; b=25.25; c="jayanto";
		System.out.println(a+" "+b+"+"+c);
		
	}
	public static void main(String[]args) 
	{
		Private_con r = new Private_con();
		
	}
}

 