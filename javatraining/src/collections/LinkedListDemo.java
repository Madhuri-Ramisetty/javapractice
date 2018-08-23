package collections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList<String> al=new LinkedList<String>(); // creating linked list
		al.add("nani");// adding elements
		al.add("durga");
		al.add("madhu");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		 }
	}

}
