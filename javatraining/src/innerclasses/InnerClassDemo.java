package innerclasses;
class OuterDemo 
{
	   int n;
	   private class InnerDemo 
	   {
	      public void print() 
	      {
	         System.out.println("This is an inner class");
	      }
	   }
	   void displayInner() 
	   {
	      InnerDemo i=new InnerDemo();
	      i.print();
	   }
	}
	   
public class InnerClassDemo 
{
	
	public static void main(String[] args) 
	{
		OuterDemo o=new OuterDemo();
		o.displayInner();
	}

}
