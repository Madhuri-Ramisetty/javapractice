package practiceprograms;
import java.util.Scanner;
import java.io.*;
public class StudentData 
{
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		int sid=s.nextInt();
		String sname=s.next();
		String sclass=s.next();
		int sfee=s.nextInt();
		s.close();
		File f=new File("StudentInfo.txt");
		try 
		{
			if(!f.exists())
			{
				boolean createNewFile=f.createNewFile();
				System.out.println(createNewFile);
				FileWriter f1=new FileWriter("Student.text");
				f1.write(sid);
				f1.write(sname);
				f1.write(sclass);
				f1.write(sfee);
				f1.close();
			}
			else
			{
				FileWriter f2=new FileWriter("Student.text");
				f2.append(Integer.toString(sid));
				f2.append(sname);
				f2.append(sclass);
				f2.append(Integer.toString(sfee));
				f2.close();
			}
		}
		catch(IOException e)
		{
			
		}
		
	}

}
