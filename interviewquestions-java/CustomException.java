package collections;

import java.util.Scanner;

public class CustomException extends Exception{

	CustomException(String string)
		{
			
			super(string);


			}

		public CustomException()
		{
			
			
		}
		public static void main(String[] args)
	{
			System.out.println(" Enter  your age ");
			Scanner sc =new Scanner(System.in);
			int age=sc.nextInt();
			try
			{
			if(age<18)
			{

			
				CustomException nve= new CustomException("valid 18 above only");
			
				throw nve;
			}else {System.out.println("You're Eligible to vote");}
			}
			 catch (CustomException nve) {
				// TODO Auto-generated catch block
				nve.printStackTrace();
				
			}
			
			
			}
			
	

}
