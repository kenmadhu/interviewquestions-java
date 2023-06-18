package java_Pract;

public class SwitchCase_Demo 
{

	public static void main(String[] args) 
	{
		String Ordered_Item = "Pizza";
		switch (Ordered_Item) 
		{
		case "Burger":
			System.out.println("You ordered Burger");
			break;
		case "HashBrowns":
			System.out.println("You ordered HashBrowns");
			break;
		case "Wrap":
			System.out.println("You ordered Wrap");
			break;
		case "Pizza":
			System.out.println("You ordered Pizza");
			break;
		case "Chips":
			System.out.println("You ordered Chips");
			break;
		case "Milkshake":
			System.out.println("You ordered Milkshake");
			break;

		default:
			break;
		}
	}

}
