package collections;
import java.util.*;
public class VectorRemoveObj 
{
	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<Object>();//creating vector object
		//adding elements to vector
		v.addElement("A");
		v.addElement(13);;
		v.addElement("M");;
		v.addElement(22);;
		System.out.println(v);//printing vector elements
		v.removeElement(13);//deleting vector elemnt 13
		System.out.println(v);
		v.removeElementAt(2);//deleting vector element at index 2
		System.out.println(v);
		v.removeAllElements();//deleting all elemnts present in vector
		System.out.println(v);
	}

}
