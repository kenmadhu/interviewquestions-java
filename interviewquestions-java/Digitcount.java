package InterviewQuestions;

public class Digitcount 
{

	public static void main(String[] args) 
	{
		
		digitcount(12444666,6);
		
		
		
		

	}

	private static void digitcount(int i, int j)
	{
		int r=i;
		int c=0;
		while(r>0)
		{
			
			
		int k=r%10;
		
		r=r/10;
         if (i==0)
         {
        	 break;
         }
		
		if (k==j)
		{
			c++;
		}
		
		}
		
	   
	   
	   System.out.println("in "+i+"     "+j+    "  is repeated for   "+ c +"times");
		
	}

}
