package oca.javaclasses.inheritancewithinterfaces;
interface Demo
{
	int n=13;
	void abc();
	static void display()
	{
		System.out.println("static method");
	}
}
class DemoImpl implements Demo
{
	public void abc() 
	{
		n=22;
		
	}
}
public class StaticInterfaceDemo 
{

	public static void main(String[] args) 
	{
		Demo id=new ImplDemo();
		id.abc();
	}

}
