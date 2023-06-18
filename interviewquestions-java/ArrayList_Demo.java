package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Demo 
{

	public static void main(String[] args) 
	{
		List <Integer> li = new ArrayList<>();
		li.add(1);
		li.add(10);
		li.add(20);
		li.add(100);
		
		li.add(0,5);
		
		System.out.println(li + "__" + li.size());
		
		li.set(3, 40);
		System.out.println(li + "__" + li.size());
		
		int a = li.get(4);
		a=120;
		if(li.contains(a))
		{

			System.out.println(a);
		}else {
			System.out.println("Not Found");
		}

		li.remove(4);
		System.out.println(li + "__" + li.size());
		/*li.clear();
		System.out.println(li + "__" + li.size());
		*/
		Collections.sort(li);
		System.out.println(li + "__" + li.size());
		
		
	}

}
