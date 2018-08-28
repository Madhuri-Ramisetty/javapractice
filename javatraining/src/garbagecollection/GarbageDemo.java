package garbagecollection;

public class GarbageDemo 
{
	//finalize() is invoked each time before the object is garbage collected and used to perform cleanup processing
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) 
	{
		GarbageDemo s1=new GarbageDemo();  
		GarbageDemo s2=new GarbageDemo();  
		s1=null;  
		s2=null;  
		System.gc();//gc() is to invoke garbage collector to perform cleanup process  
	}

}
