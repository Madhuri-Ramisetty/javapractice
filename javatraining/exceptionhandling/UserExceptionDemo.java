package oca.exceptionhandling;

public class UserExceptionDemo 
{
	public static void main(String[] args)
	{
		int i,j;
		i=8;
		j=9;
		try
		{
			int k=i/j;
			if(k==0)
				throw new UserException("this is not possible");
				System.out.println(k);
			
		}
		catch(UserException e)
		{
			System.out.println("error  "+e.getMessage());
		}
	}
}
