package polymorphism;
//method overloading is an example of compile time polymorphism
class Overload
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)//method overloading
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a)//method overloading 
    {
       System.out.println("double a: " + a);
       return a*a;
    }
}
public class CompileTimePolymorphism 
{
	public static void main(String[] args) 
	{
		 Overload a= new Overload();
	     double result;
	     a.demo(10);
	     a.demo(10, 20);
	     result=a.demo(5.5);
	     System.out.println(result);
	}

}
