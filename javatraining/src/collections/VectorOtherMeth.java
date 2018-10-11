package collections;
import java.util.*;
public class VectorOtherMeth 
{
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<Integer>();//creating vector objects
		//adding elements from 0 to 4 to a vector
		for(int i=0;i<5;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);//printing vector elements
		System.out.println(v.capacity());//to get capacity of vector
		System.out.println(v.size());//to get size of the vector
		//adding elements 0 to 9 to vector
		for(int j=0;j<10;j++)
		{
			v.addElement(j);
		}
		System.out.println(v);//printing elements of vector
		System.out.println(v.capacity());//to get capacity of vector
		System.out.println(v.size());//to get size of vector
	}

}
