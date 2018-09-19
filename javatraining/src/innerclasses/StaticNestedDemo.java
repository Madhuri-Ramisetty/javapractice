package innerclasses;

public class StaticNestedDemo 
{
	static class NestedDemo {
	      public void myMethod() 
	      {
	         System.out.println("This is my nested class");
	      }
	   }
	public static void main(String[] args) 
	{
		StaticNestedDemo.NestedDemo n=new StaticNestedDemo.NestedDemo();	 
	    n.myMethod();
	}

}
