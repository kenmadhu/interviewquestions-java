package oops;

public class Polymorphism_Demo
{
	public static void main(String[] args) 
	{
		Polymorphism_Person p = new Polymorphism_Person();
		Polymorphism_Person q = new Polymorphism_Indian();
		Polymorphism_Person r = new Polymorphism_Tamilian();

		p.SpeakLang();
		q.SpeakLang();
		r.SpeakLang();
	}

}
