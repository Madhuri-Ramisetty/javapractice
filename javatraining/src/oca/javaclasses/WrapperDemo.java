package oca.javaclasses;
//primitive types are more faster than wrapper classes but some frameworks does not work with primitive types like hibernate and API etc
public class WrapperDemo {

	public static void main(String[] args) 
	{
		/*int i=13;
		Integer ii=new Integer(5);//ii is the reference of class Integer
		//putting value in an object is called boxing or wrapping
		int j=ii.intValue();//removing value from object is unboxing
		
		Integer value=5;//autoboxing
		int k=value;//autounboxing*/
		String s="437";
		//converting string value into int
		int n=Integer.parseInt(s);//Integer is a class
		System.out.println(s);
		System.out.println(n);
		
	}

}
