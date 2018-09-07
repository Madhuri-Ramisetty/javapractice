package filehandling;
import java.io.FileWriter;
public class FileWriterDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter f=new FileWriter("madhu.txt");
			f.write("Hello! I'm Madhuri");
			f.close();
		}
		catch(Exception e)
		{
		}
	}

}
