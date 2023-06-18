package collections;

import java.util.HashMap;

public class HashMap_Demo
{

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("AndhraPradesh", "Amaravathi");
		hm.put("TamilNadu", "Chennai");
		hm.put("Bihar", "Patna");
		hm.put("Rajasthan", "Jaipur");
		System.out.println(hm);
		System.out.println(hm.get("Bihar"));
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Amaravathi");
		h.put(2, "Chennai");
		h.put(3, "Delhi");
		h.put(3, "Patna");
		h.put(4, "Jaipur");
		System.out.println(hm);
		
		
		System.out.println(hm.get("Bihar"));
		

		System.out.println(h);
		System.out.println(h.get(1));
		System.out.println(h.size());
		
		
		
		HashMap<String, String> ph = new HashMap<String, String>();
		ph.put("Naveen", "+447405104490");
		ph.put("Praveen", "+9177020575256");
		System.out.println(ph.keySet());
		System.out.println(ph.values());
		ph.remove("Naveen");
		System.out.println(ph.keySet());
		System.out.println(ph.values());
		ph.clear();
		System.out.println(ph);
		
		
		
	}
	

}
