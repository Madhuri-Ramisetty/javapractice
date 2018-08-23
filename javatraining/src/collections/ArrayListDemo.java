package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();  // creating array list
		 al.add("nani");                // adding elements    
		 al.add("madhu");
		 al.add("durga");
		 Iterator itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
	}
}
