package collections;
import java.util.*;
public class ArrayList3 
{
	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();//reating an ArrayList
		//adding elements of an ArrayList
		al.add("m");
		al.add(13);
		al.add("d");
		al.add(null);
		System.out.println(al);//printing ArrayList
		al.remove(2);//removing element at index 2
		System.out.println(al);//printing ArrayList after removing element
		al.add("A");//adding element to ArrayList
		al.add(3,"N");//Replacing element at index 3 with "N"
		System.out.println(al);//printing ArrayList after replacing
	}

}
