package collections;
import java.util.*;
public class VectorGetObj 
{
	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<Object>();//creating vector object
		//adding elements to vector
		v.addElement("A");
		v.addElement(13);
		v.addElement("M");
		v.addElement(22);
		System.out.println(v);//printing vector elements
		System.out.println(v.firstElement());//printing first element of vector
		System.out.println(v.get(2));//printing element at index 2
		System.out.println(v.lastElement());//printing last element
	}

}
