package java_Pract;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StringArray_Demo 
{

	public static void main(String[] args) 
	{
		String [] Sports = {"football", "Cricket", "Swimming", "Table Tennis", "Archery"};
		
		/*
		System.out.println(Sports.length);
		for (String Sport : Sports) 
		{
			System.out.println(Sport);
		}
		
		System.out.println("");
		Arrays.sort(Sports, Collections.reverseOrder());
		for (String Sport : Sports) 
		{
			System.out.println(Sport);
		}
		*/
		String Name ="football";
		char [] SportArray = Name.toCharArray();
		System.out.println(Name.charAt(1));
		int count = 0;
		for (int i = 0; i < SportArray.length; i++) 
		{ 
			count = 0;
			
			for (int j = 0; j < SportArray.length; j++) 
			{
				if(Name.charAt(j)==SportArray[i])
				{
					count++;
				}
			}
				System.out.println(SportArray[i] + " : " + count);
			}
	}

	private static char SportArray(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
