class Myth1 extends Thread
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

class Myth2 extends Thread
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

public class ThreadUsing
{
	public static void main(String args[])
	{
		Myth1 m1 = new Myth1();
		Myth2 m2 = new Myth2();
		
		m1.start();
		try
		{
			m1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		m2.start();
	}
}