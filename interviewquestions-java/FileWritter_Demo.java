package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter_Demo
{

	public static void main(String[] args) throws IOException 
	{
		String path = "E:\\PathFile1.txt";
		FileWriter f = new FileWriter(path);
		f.write("My name is naveen\nI'm Liviing in London");
		f.close();
		
		
	}

}
