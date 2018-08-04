package multithreading;
class Hi implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}
class Threa implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("thread is running");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}
public class MultiThreadingInterface {

	public static void main(String[] args) 
	{
		Runnable h=new Hi();
		Runnable t=new Threa();
		Thread t1=new Thread(h);
		Thread t2=new Thread(t);
		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e) {}
		t2.start();
	}

}
