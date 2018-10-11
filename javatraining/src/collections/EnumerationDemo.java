//Enumeration is used to obtain objects one by one
package collections;
import java.util.*;
public class EnumerationDemo 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		//Assigning elements of vector form 0 to 4
		for(int i=0;i<5;i++)
		{
			v.addElement(i);//adding elements from 0 to 4
		}
		System.out.println(v);//printing elements of vector
		Enumeration<Integer> e= v.elements();//Enumeration object is created using elements() method of vector class
		while(e.hasMoreElements())//tests whether if there are more elements or not
		{
			Integer i=(Integer)e.nextElement();//returns next element in the series
			//printing odd numbers from 1 to 4
			if(i%2!=0)
			{
				System.out.println(i);//printing odd elemnts
			}
		}
		System.out.println(v);//printing the vector
	}
}
