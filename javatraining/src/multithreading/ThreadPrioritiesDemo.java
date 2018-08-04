package multithreading;

public class ThreadPrioritiesDemo {

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
			});
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
			});
			System.out.println(t1.getPriority());//default priority 5 norm priority
			System.out.println(t2.getPriority());//default priority 5 norm priority
			t1.setPriority(Thread.MIN_PRIORITY);//t1.setPrioroty(1);
			t2.setPriority(Thread.MAX_PRIORITY);//t2.setPriority(10);
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			t1.start();
			try 
			{
				Thread.sleep(10);
			}
			catch(Exception e) {}
			t2.start();
		}
	}


