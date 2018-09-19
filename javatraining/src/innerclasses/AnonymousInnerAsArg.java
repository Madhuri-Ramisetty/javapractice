package innerclasses;
interface Message
{
	String greet();
}
public class AnonymousInnerAsArg 
{
	public void displayMessage(Message m) 
	{
	      System.out.println(m.greet() +"!This is an example of anonymous inner class as an argument"); 
	}
	public static void main(String[] args) 
	{
		AnonymousInnerAsArg a=new AnonymousInnerAsArg();
	      // Passing an anonymous inner class as an argument
	      a.displayMessage(new Message() {
	         public String greet() {
	            return "Hello";
	         }
	      });
	}

}
