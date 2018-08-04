package multithreading;
class Wish extends Thread
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
class Thre extends Thread
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
public class MultiThreadingDemo {

	public static void main(String[] args) 
	{
		Wish w=new Wish();
		Thre t=new Thre();
		w.start();
		t.start();
	}

}
