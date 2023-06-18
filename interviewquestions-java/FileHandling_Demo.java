package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling_Demo
{

	public static void main(String[] args)
	{
		File txt = new File("E:\\PathFile1.txt");
		boolean result;
		try
		{
			result = txt.createNewFile();
			System.out.println(result);
			} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
