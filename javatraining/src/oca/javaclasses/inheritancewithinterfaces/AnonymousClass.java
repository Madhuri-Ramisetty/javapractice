package oca.javaclasses.inheritancewithinterfaces;
//Anonymous class is the one which has no name 
interface Age
{
	int x=23;
	public void getAge();
}
public class AnonymousClass 
{
	public static void main(String[] args) 
	{
		Age a=new Age()
		{
			public void getAge()
			{
				System.out.println("Age is"+x);
			}
		};
	a.getAge();
	}
}
