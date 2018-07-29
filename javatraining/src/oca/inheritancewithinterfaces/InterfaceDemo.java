package oca.inheritancewithinterfaces;
//An interface is used to achieve Multiple inheritance.
//An interface should not contain abstract methods and constructors.
//we can give only a reference to interface and hence no object is created to an interface.
interface VehicleOne
{
	int speed=90;
	public void distance();
}
interface VehicleTwo
{
	int distance=100;
	public void speed();
}
class Vehicle implements VehicleOne,VehicleTwo
{
	public void distance()
	{
		int distance=speed*100;
		System.out.println("distance is"+distance);
	}
	public void speed()
	{
		int speed=distance/100;
		System.out.println("speed is"+speed);
	}
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		System.out.println("vehicle");
		Vehicle v=new Vehicle();
		v.distance();
		v.speed();
	}

}
