package collections;
import java.util.*;
public class LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("nani");
		al.add("durga");
		al.add("madhu");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		 }
	}

}
