package collections;
import java.util.*;
public class ArrayListSort 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();//creating an ArrayList
		//adding elemnts to Arrayist
		al.add("madhu");
		al.add("nani");
		al.add("durga");
		al.add("ammu");
		System.out.println(al);//printing elements of an ArrayList
		Collections.sort(al);//sorting elements of ArrayList
		System.out.println(al);//printing ArrayList after sorting
	}

}
