package oca.javaclasses;
class Student
{
	int rollno;
	String name;
	public void setDetails(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public void display()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
}
public class This 
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setDetails(135,"durga");
		s.display();
	}
	

}
