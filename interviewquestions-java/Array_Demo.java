package java_Pract;

import net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment;

public class Array_Demo 
{

	public static void main(String[] args) 
	{
		int [] listItems = {10, 20 , 30};
		int sum =0; 
		for (int i = 0; i < listItems.length; i++) 
		{
			sum = sum + listItems[i];
		}
		System.out.println(sum);
		
		
		int [] ItemList = {10, 20, 40};
		int common = 0, a=0, b=0 ;
		int [] Similar = {};
		System.out.println("common values are ");
		
		for (int i : ItemList) 
		{
			for (int j : listItems) 
			{
				if(i==j)
				{
					//System.out.println("Value i : " + i + " and Value j : " + j + " are equal");
					common++;
					a=i;
					System.out.println(" "+ a );
					}
					
					
				}
				
				/*else
				{
					System.out.println(" are not similar");
				}*/
		
			}
		
	}

}
