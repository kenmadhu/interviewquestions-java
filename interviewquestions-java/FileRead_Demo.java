package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead_Demo {

	public static void main(String[] args) throws FileNotFoundException 
	{
		String path = "E:\\PathFile1.txt";
		File f = new File(path);
		Scanner s = new Scanner(f);
		while(s.hasNextLine())
		{
			String text = s.nextLine();
			System.out.println(text);
		}
		s.close();
	}

}
