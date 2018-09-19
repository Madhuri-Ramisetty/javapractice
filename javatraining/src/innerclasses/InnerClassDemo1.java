package innerclasses;
class OuterDemo1 
{
	   // private variable of the outer class
	   private int num = 175; 
	   //inner class
	   public class InnerDemo 
	   {
	      public int getNum() 
	      {
	         System.out.println("This is the getnum method of the inner class");
	         return num;
	      }
	   }
	}

public class InnerClassDemo1 
{
	public static void main(String[] args) 
	{
		OuterDemo1 outer = new OuterDemo1();
	      
	      // Instantiating the inner class
	      OuterDemo1.InnerDemo inner = outer.new InnerDemo();
	      System.out.println(inner.getNum());
	}

}
