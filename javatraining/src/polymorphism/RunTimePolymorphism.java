package polymorphism;
//method overriding is an example of run time polymorphism
class Animal 
{
	public void sound()
	{
		System.out.println("animal is making ");
	}
}
class Horse extends Animal
{
	public void sound()//override
	{
		System.out.println("neigh");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("meow");
	}
}
public class RunTimePolymorphism 
{
	public static void main(String[] args)
	{
		Animal h=new Horse();
		Animal c=new Cat();
		h.sound();
		c.sound();
	}
}
