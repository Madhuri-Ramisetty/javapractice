package oca.accessmodifiers;
class AccessDemo
{
	private int x=58;
	public void showDemo()
	{
		System.out.println("the value of integer is "+x);
	}
	public void testDemo()
	{
		System.out.println("private modifier can't be accessed in other classes");
	}
}
public class PrivateAccessModifier 
{

	public static void main(String[] args) 
	{
		AccessDemo ad=new AccessDemo();
		ad.testDemo();
		ad.x=40;//private variable s can't be used here
		ad.showDemo();

	}

}
