package collections;
import java.util.*;
public class ElementsOfArrayListToArray {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		Object[] o=al.toArray();//method to copy all elements of array list to array
		for(int i=0;i<o.length;i++)//displaying elements of array
		{
			System.out.println(o[i]);
		}
		
		
	}

}
