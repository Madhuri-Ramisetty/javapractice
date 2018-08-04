package multithreading;
class Table
{
	public synchronized void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
	}
}
public class ThreadSyncDemo {

	public static void main(String[] args) 
	{
		Table t= new Table();  
		Thread t1=new Thread()
		{  
			public void run()
			{  
				t.printTable(4);  
			}
		};  
		Thread t2=new Thread()
		{  
			public void run()
			{  
				t.printTable(40);  
			}
		};
		t1.start();  
		t2.start();  
	}

}
