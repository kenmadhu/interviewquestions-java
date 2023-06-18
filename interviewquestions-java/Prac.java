package java_Pract;

import java.util.Arrays;
import java.util.Scanner;

public class Prac 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		// create a new Array 
		int arr[] =new int[5];
		System.out.println(" Enter numbers    ");
		// read number from keyboard
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("you entered  numbers ");
		// display  using for-each loop 
		for(int i: arr)
		{
			System.out.println(i);
		}
		System.out.println(" array will be sorted ");
		Arrays.sort(arr);
		System.out.println(" display   the sorted array ");
		for(int i: arr)
		{
			System.out.println(i);
		}
	}
}
