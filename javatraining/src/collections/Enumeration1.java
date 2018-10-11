package collections;
import java.util.*;
public class Enumeration1 
{
	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		v.add("durga");
		v.add("madhuri");
		v.add("ramisetty");
		v.add("09-06-1996");
		System.out.println(v);
	    Enumeration<String> e= v.elements();
	    while(e.hasMoreElements())
	    {
	    	String s=(String) e.nextElement();
	    	System.out.println(s);
	    }
	}
}
