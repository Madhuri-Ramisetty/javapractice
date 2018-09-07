package filehandling;
import java.io.*;
public class FileBufferedWriter 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter f= new FileWriter("durga.txt");  
		    BufferedWriter b= new BufferedWriter(f);  
		    b.write("This is written in buffered writer");  
		    b.close();  
		}
		catch(Exception e)
		{
		}
	}

}
