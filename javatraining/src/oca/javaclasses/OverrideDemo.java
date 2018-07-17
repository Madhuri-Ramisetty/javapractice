package oca.javaclasses;
//A sub class providing same method and method signatures of super class is called method overriding
class Stud
{
	public void display()
	{
		System.out.println("details of student");
	}
}
class College extends Stud
{
	public void display()//method overriding
	{
		super.display();
		System.out.println("details of college student");//method overriding is run timr polymorphism
	}
}
class SchoolStud extends Stud
{
	public void display()
	{
		System.out.println("details of school student");
	}
}
public class OverrideDemo {

	public static void main(String[] args) 
	{
		College c=new College();
		c.display();
		
		
		Stud s=new College();//reference of Stud and object of College//runtime polymorphism
		s.display();
		s=new SchoolStud();
		s.display();//dynamic method dispatch
	}

}
