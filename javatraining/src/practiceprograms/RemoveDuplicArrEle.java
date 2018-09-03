package practiceprograms;

import java.util.Scanner;

public class RemoveDuplicArrEle 
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
		System.out.println("elements before removing duplicates");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");//printing sorted array 
		}
		System.out.println("after removing duplicates");
		//for removing duplicates
		for(int i=0;i<n;i++)
		{
			if(a[i]!=a[i+1])//comparing elements
			{
				a[k]=a[i];//assigning values with respect to index k
				k++;
			}
		}
		a[k]=a[n-1];
		k++;
		//printing updated array
		for(int i=0;i<n-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
