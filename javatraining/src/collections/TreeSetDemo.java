package collections;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();  // creating treeSet
		ts.add("nani");// adding elements
		ts.add("durga");
		ts.add("madhu");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

}
