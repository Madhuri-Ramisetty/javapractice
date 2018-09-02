package polymorphism;
class ABC
{
	 public void myMethod()
	 {
		 System.out.println("Overridden Method");
	  }
}
class XYZ extends ABC
{
	  public void myMethod()
	  {
		System.out.println("Overriding Method");
	   }
}
public class MethodOveriding 
{
	public static void main(String[] args) 
	{
		ABC obj = new XYZ();
		obj.myMethod();
	}

}
