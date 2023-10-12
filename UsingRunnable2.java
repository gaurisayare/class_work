class MyRunnable1 implements Runnable
{
	public void run()
	{
		int i = 0;
		while(i<20)
		{
			System.out.println("Thread 1 is running");
			System.out.println("I am Sad");
			i++;
		}
	}
	
}

class MyRunnable2 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<20)
		{
			System.out.println("Thread 2 is Running");
			System.out.println("I am Happy");
			i++;
		}
	}
}

public class UsingRunnable2
{
	public static void main(String args[])
	{
		MyRunnable1 myth1 = new MyRunnable1();
		Thread th1 = new Thread(myth1);
		MyRunnable2 myth2 = new MyRunnable2();
		Thread th2 = new Thread(myth2);
		
		th1.start();
		th2.start();
	}
}