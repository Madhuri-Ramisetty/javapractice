package oca.javaclasses;

class Add//super class
{
	public int add(int i,int j)
	{
		return i+j;
	}
}
//single level inheritance
class Sub extends Add//sub class
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
//multi level inheritance
class Mul extends Sub//sub class
{
	public int mult(int i,int j)
	{
		return i*j;
	}
}
public class InheritanceDemo 
{
	public static void main(String[] args)
	{
		Mul s=new Mul();
		int sum=s.add(13,4);
		int dif=s.sub(22,13);
		int mul=s.mult(31, 40);
		System.out.println(sum+" "+dif+" "+mul);
	}

}
