package garbagecollection;

public class GarbageCollection 
{
	protected void finalize()
	   {
	        System.out.println("Garbage collection is performed by JVM");
	   }
	public static void main(String[] args) 
	{
		GarbageCollection g=new GarbageCollection();
		g=null;//assigning a null value to a reference so that object becomes non reachable
		GarbageCollection g1=new GarbageCollection();
		GarbageCollection g2=new GarbageCollection();
		g2=g1;// assigning reference g1 to the another reference b to make the object referenced by g2 unusable.
		System.gc();
	}

}
