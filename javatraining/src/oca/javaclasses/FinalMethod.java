package oca.javaclasses;
class X
{
	final void getMethod()
	{
		System.out.println("method of X is called");
	}
}
class Y extends X
{
	/*void getMethod()
	{
		System.out.println("method of Y is called");
	}*/
}
public class FinalMethod {

	public static void main(String[] args) 
	{
		X x=new X();
		x.getMethod();

	}

}
