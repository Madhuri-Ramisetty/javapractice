package oca;
public class ArraySample2 
{
	public static void main(String[] args)
	{
		int[] arr= {1,3,5,7,9};
		int total=0;
		//iterating arr values to sum the values
		for(int i=0;i<5;i++)
		{
			total=arr[i]+total;
		}
		System.out.println(total);	
	}
}
