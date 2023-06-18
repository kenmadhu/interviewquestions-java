package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> Linked = new LinkedList<String>();
		Linked.add("London");
		Linked.add("Cardiff");
		Linked.add("Llandudno");
		Linked.add("Flint");
		Linked.add("Hatfield");
		Linked.add("Hounslow");
		Linked.add("London");
		System.out.println(Linked);
		System.out.println(Linked.getFirst());
		System.out.println(Linked.getLast());
		Linked.addFirst("Broughton");
		System.out.println(Linked);
		
		Linked.removeFirst();
		System.out.println(Linked);
		Linked.removeLast();
		System.out.println(Linked.getFirst());
		System.out.println(Linked.getLast());
		Linked.removeFirst();
		System.out.println(Linked.getFirst());
		Linked.removeLast();
		System.out.println(Linked.getLast());
		
		
	}

}
