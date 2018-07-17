package oca.javaclasses;

final class FinalClassParent
{
	public void testCode()
	{
		System.out.println("this is the method of final class");
	}
}
/*public class FinalClassChild extends FinalClassParent
{
	private void testCode()
	{
		System.out.println("this is the method of inherited class");
	}
}*/
public class FinalClass {

	public static void main(String[] args) 
	{
		FinalClassParent f=new FinalClassParent();
		f.testCode();
	}

}
