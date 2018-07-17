package oca.javaclasses;
//Encapsulation means binding data with methods
class Students
{
	private int rollno;
	private String name;
	//Getters and Setters
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
}
public class EncapsulationDemo 
{
	

	public static void main(String[] args)
	{
		Students s=new Students();
		s.setRollno(91);
		s.setName("durga");
		System.out.println(s.getRollno()+" "+s.getName());
	}

}
