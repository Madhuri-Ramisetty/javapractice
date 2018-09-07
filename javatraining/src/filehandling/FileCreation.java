package filehandling;
import java.io.File;
import java.io.IOException;
public class FileCreation 
{
	public static void main(String[] args) 
	{
		File f=new File("durga.txt");
		try
		{
			boolean createNewFile=f.createNewFile();
			System.out.println(createNewFile);
		}
		catch(IOException e)
		{
			
		}
	}

}
