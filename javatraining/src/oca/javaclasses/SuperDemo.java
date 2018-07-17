package oca.javaclasses;
class A
{
	public A()
	{
		System.out.println("default constructor of A");
	}
	public A(int i)
	{
		System.out.println("parameterized constructor of A");
	}
}
class B extends A
{
	public B()
	{
		super(4);
		System.out.println("default constructor of B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("parameterized constructor of B");
	}
	
}
public class SuperDemo 
{
	public static void main(String[] args)
	{
		B b=new B(4);
	}
}
