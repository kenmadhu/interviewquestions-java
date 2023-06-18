package collections;

import java.util.HashSet;

public class HashSetMethod_Demo
{

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Andhra");
		hs.add("Telangana");
		hs.add("Kerala");
		hs.add("Tamilnadu");
		hs.add("andhra");
		hs.add("telangana");
		hs.add("kerala");
		hs.add("tamilnadu");
		System.out.println(hs);
		
		System.out.println(hs.contains("Andhra"));
		
		
		for (String string : hs) 
		{
			System.out.println(string);
		}
	}

}
