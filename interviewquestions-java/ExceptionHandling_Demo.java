package collections;

public class ExceptionHandling_Demo 
{
	public static void main(String[] args) 
	{
		try
		{			
			int a = 10, b=0;
			int c = a/b;
			System.out.println(c);

		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Can't divide by zero");
			System.out.println(e.getCause());
			
		}
		
		try {
			
		} 
		catch  (Exception e)
		{
			
		}
		finally {};
		
		try
		{
			int [] a = {1,5,6,9,15};
			System.out.println(a[7]);
			for (int i = 0; i < a.length; i++)
			{
				break;
			}
		}
		finally {};
	}
	// There are two exception 
	// Checked and Un-Checked Exceptions.
	
	
	
	
}
