package cryptoP3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagment 
{
	
	public String readFromFile()
	{
		File f = new File("C:\\Users\\ASUS\\eclipse-workspace\\cryptoP3\\src\\cryptoP3\\Input.txt");
		String s="";
		try (Scanner read = new Scanner(f))
		{
			while(read.hasNext())
			{
				 s += read.nextLine()+"\n";
				 
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}
	public void writeToFile(String s)
	{
		File f = new File("C:\\Users\\ASUS\\eclipse-workspace\\cryptoP3\\src\\cryptoP3\\Output.txt");
		try(FileWriter writer = new FileWriter(f) )
		{
			writer.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
