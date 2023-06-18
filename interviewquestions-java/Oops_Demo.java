package oops;

public class Oops_Demo 
{
	int x ; 					//Constructor is a special method used to initialise variables.
	private int y;
	public Oops_Demo(int z, int y)
	{
		x=z+y;
	}
	public static void main(String[] args) 
	{
		Oops_Demo o = new Oops_Demo(10, 3);

		System.out.println(o.x);
		o.x = o.x * o.y;
		System.out.println(o.x);
		
		
		
	}
	
	
	
	

}
