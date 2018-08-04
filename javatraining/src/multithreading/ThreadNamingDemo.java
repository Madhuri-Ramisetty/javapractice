package multithreading;

public class ThreadNamingDemo 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(()->
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
		},"Hi thread");
		Thread t2=new Thread(()->
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
		},"Hello thread");
		/*t1.setName("Hi thread");
		t2.setName("Hello thread");*/
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
	}
}
