package practiceprograms;

import java.util.Scanner;

public class EleSumArr 
{
	public static void main(String[] args) 
	{
		int[] a=new int[20];
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//to give size of an array
		int m=s.nextInt();//for giving a number
		//for loop for giving elements
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		//for loops for comparision of elements
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==m)//adding any two elements and comparing with the given number
				{
					System.out.println(a[i]+" "+a[j]);//printing the two numbers whose sum is equal to given number
				}
			}
		}
	}

}
