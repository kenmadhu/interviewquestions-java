package oops;

import java.io.File;
import java.io.IOException;

public class FileCreation_Demo 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("E:\\SeleniumPractise\\‪naveen123.txt");

		
		if(f.createNewFile())
		{
			System.out.println("File Created");
		}
			
	}

}
