package collections;
import java.util.*;
public class LinkedList1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("madhu");  
		ll.add("durga");  
		ll.add("madhu");  
		ll.add("nani");  
		Iterator<String> itr=ll.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next()); 
		}
	}

}
