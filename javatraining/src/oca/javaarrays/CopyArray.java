package oca.javaarrays;

public class CopyArray 
{
	public static void main(String[] args)
	{
		char[] arr1={'d','u','r','g','a','m','a','d','h','u','r','i'};
		char[] arr2=new char[10];//creation of arr2
		System.arraycopy(arr1,3,arr2,0,8);//copying from arr1 3rd position to 0 to 8 positions of arr2
		System.out.println(new String(arr2));
	}
	

}
