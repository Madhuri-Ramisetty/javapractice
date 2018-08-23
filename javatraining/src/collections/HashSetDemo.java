package collections;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet(); // creating hashSet
		 hs.add("nani");// adding elements
		 hs.add("durga");
		 hs.add("madhu");
		 Iterator<String> itr=hs.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
	}

}
