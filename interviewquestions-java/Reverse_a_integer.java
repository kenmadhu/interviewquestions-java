package InterviewQuestions;

/* Reverse a integer 
 *  Input :564 
 *  output:465
 * 
 */
public class Reverse_a_integer {

	public static void main(String[] args)
	{
		
		int result= reverse_a_integer(564);
		
		System.out.println(result);
		

	}

	private static int reverse_a_integer(int i) 
	{
		int r=0;
		while(i!=0)
		{
			int d =i%10;
		
			r=r*10+d;
			i=i/10;
			
		}
		return r; 
		
		
	}

}
