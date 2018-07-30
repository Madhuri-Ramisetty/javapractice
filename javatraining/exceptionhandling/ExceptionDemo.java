package oca.exceptionhandling;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		try
		{
			int i=40,j=0;
			int k=i/j;
			System.out.println("result is"+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error");
		}
		finally
		{
			System.out.println("bye");
		}
	}

}
