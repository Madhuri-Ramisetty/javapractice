package oca.javaclasses;

class Sum
{
	int a,b,c,d,e;
	public void total()
	{
		e=a+b+c+d;
	}
	public Sum()//constructor
	{
		System.out.println("this is a constructor");
	}
	public Sum(int n)//parameterized constructor constructor
	{
		a=n;
	}
}
public class ClassObj 

{
	public static void main(String[] args)
	{
		Sum ob=new Sum(10);//object creation
		ob.a=1;
		ob.b=2;
		ob.c=3;
		ob.d=4;
		ob.total();
		System.out.println(ob.e);
		System.out.println(ob.a);
	}

}
