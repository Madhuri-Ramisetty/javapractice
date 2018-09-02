package polymorphism;
class Multiply
{
	void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	void mul(int a,int b,int c)
	{
		System.out.println(a*b*c);
	}
}
public class Polymorphism 
{
	public static void main(String[] args)
	{
		Multiply m=new Multiply();
		m.mul(10,20);
		m.mul(10,20,30);
	}
}
