package oca.javaclasses.inheritancewithinterfaces;
interface Demo
{
	void abc();
	default void display()
	{
		System.out.println("default display method");
	}
	
}
class ImplDemo implements Demo
{
	public void abc()
	{
		System.out.println("in method abc");
	}
	public void display()
	{
		System.out.println("new display method");
	}
}
public class DefaultInterfaceDemo 
{
	public static void main(String[] args)
	{
		Demo id=new ImplDemo();
		id.abc();
		id.display();
	}
}
