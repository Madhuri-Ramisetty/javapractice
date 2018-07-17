package oca.javaclasses;
//if class is taken as an abstract class then no need to instantiate the class but can be invoked if main exists
//abstraction is a process of of hiding implementation details and showing only functionality to the user
abstract class Bike
{
	abstract void run();//declaring run() method 
}
class Pept extends Bike
{
	void run()
	{
		System.out.println("moves safe...");
	}
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		
		Bike b=new Pept();//reference to Bike class and object of Pept class
		b.run();
	}

}
