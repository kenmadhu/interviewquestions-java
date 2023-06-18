package fileHandling;

import java.io.File;

public class FileDelete_Demo {

	public static void main(String[] args) 
	{
		String path = "E:\\PathFile1.xlsx";
		File f = new File(path);
		f.delete();
		
	}

}
