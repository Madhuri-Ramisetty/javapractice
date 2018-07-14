package oca.javaclasses;

public class Selections 
{
	public static void main(String[] args)
	{
		int m=4;
		//if condition for knowing whether a given number is even or odd
		if(m%2==0)
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");
		//finding whether a num is even or odd by using ternary operator
		String n=(m%2==0)?"even":"odd";
		System.out.println(n);
		//switch statement
		switch(m)
		{
			case 1:
				System.out.println("sunday");
				break;
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("friday");
				break;
			case 7:
				System.out.println("saturday");
				break;
			default:
				System.out.println("no day");
				break;
		}
		//while loop
		int i=1,sum=0;
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		//do while loop
		int d=13;
		do
		{
			System.out.println(d);
		}while(d<=10);
		//for loop	
		for(int f=1;f<=10;f++)
		{
			System.out.println(f);
		}
		//nested for loops
		for(int p=1;p<=6;p++)
		{
			for(int q=1;q<=p;q++)
			{
				System.out.print(q+" ");
			}
			System.out.println();
		}
		//continue statement for printing numbers from 1 to 10 except 3
		for(int r=1;r<=10;r++)
		{
			if(r==3)
			{
				continue;
			}
			System.out.println(r);
		}
		//break statement
		for(char c='A';c<='Z';c++)
		{
			if(c=='N')
			{
				break;
			}
			System.out.println(c);
		}
		}
	}

