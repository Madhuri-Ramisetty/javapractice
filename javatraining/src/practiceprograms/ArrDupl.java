package practiceprograms;

import java.util.Scanner;

public class ArrDupl 
{
	public static void main(String[] args) 
	{
		int n,t,k=0;
		int[] a=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		n=s.nextInt();//to give size of an array
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		//for sorting elements of an array
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("sorted elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");//printing sorted array 
		}
		System.out.println("elements with duplications are");
		//finding elements with duplicates
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])//comparing elements to find duplicates
				{
					System.out.println(a[i]);//printing elements with duplicates
				}
			}
		}
	}

}
