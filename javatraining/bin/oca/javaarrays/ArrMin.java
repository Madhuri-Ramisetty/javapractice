package oca.javaarrays;

public class ArrMin 
{
	public static void main(String[] args)
	{
		int[] arr= {13,45,4,16,22};
		int min=arr[0];
		//iteration of array elements to find minumum element of array
		for(int i=0;i<5;i++)
		{
			//storing minimum element to min variable
			if(min>arr[i])
				min=arr[i];
				
		}
		System.out.println(min);
	}


}
