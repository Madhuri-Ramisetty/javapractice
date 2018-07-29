package oca.accessmodifiers;
class DefaultDemo
{
	int x=440;
}
public class DefaultAccessModifier {

	public static void main(String[] args) 
	{
		DefaultDemo d=new DefaultDemo();
		int m=d.x;
		System.out.println("the value of integer with default access specifier is"+m);
	}

}
