package collections;
import java.util.*;
public class ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();//creation of an ArrayList
		//adding elements to ArrayList
		al.add(10);
		al.add(22);
		al.add(31);
		al.add(40);
		System.out.println(al);//printing elements of an ArrayList
		al.remove(2);//removing an element from ArrayList at index 2
		al.set(1, 13);//replacing an element at index 1
		System.out.println(al);//printing ArrayList after removing and replacing elements
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(103);
		l.add(112);
		l.add(121);
		System.out.println(l);
		System.out.println(al);
		al.addAll(1,l);//addAll()is used to add elements of one list to other list;elemnts of object l are added at index 1 of object al		
		System.out.println(al);
	}

}
