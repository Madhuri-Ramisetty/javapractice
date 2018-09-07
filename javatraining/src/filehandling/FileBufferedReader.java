package filehandling;

import java.io.*;

public class FileBufferedReader 
{
	public static void main(String[] args)
	{
		try
		{
			 FileReader f=new FileReader("durga.txt");   
	         BufferedReader b=new BufferedReader(f);
	         int i;
	         while((i=b.read())!=-1)
			 	System.out.print((char)i);  
	         b.close();
		}
	          catch(Exception e)
	          {
	        	  
	          }
	}
}
