package InterviewQuestions;

/* Print Pattern 
 * Input : string
 * output:
 * 
 *  string
 *  strin
 *  stri
 *  str
 *  st
 *  s
 * 
 * 
 * 
 * 
 */
public class Pattern1 
{

	public static void main(String[] args)
	{
		
		dopattern("string");
	
	}

	private static void dopattern(String string) 
	{
	   char [] c=	string.toCharArray();
	   
	   for(int i=0;i<c.length;i++)
		   
	   {
		  
		  for(int j=0;j<c.length-i;j++)
		  {
			  System.out.print(c[j]);
		  }
		   
		   System.out.println();
	   }
	}
}

