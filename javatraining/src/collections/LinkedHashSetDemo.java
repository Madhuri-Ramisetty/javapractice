package collections;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs=new LinkedHashSet(); // creating linkedhashset
		lhs.add("nani");// adding elements 
		lhs.add("durga");
		lhs.add("madhu");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

}
