package innerclasses;

public class OuterClassDemo 
{
	void myMethod() 
	{
	      int num = 23;
	      class MethodInnerClassDemo 
	      {
	         public void print() 
	         {
	            System.out.println("This is method inner class "+num);	   
	         }   
	      }
	      MethodInnerClassDemo i=new MethodInnerClassDemo();
	      i.print();
	   }
	public static void main(String[] args) 
	{
		OuterClassDemo o=new OuterClassDemo();
	    o.myMethod();
	}

}
