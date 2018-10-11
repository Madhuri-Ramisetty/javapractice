package collections;
import java.util.*;
public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("madhu");
		al.add("durga");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
