
class MyTask extends Thread
{
	public void run()
	{
		for(int doc = 1;doc<=100;doc++)
		{
			System.out.println("@@@ Document is #"+doc+" printer 2");
		}
	}
}

public class App
{
	public static void main(String args[])
	{
		//TODO Auto-generated method stub
		//job1
		System.out.println("--------Application Started---------");
		
		//job2
		MyTask task = new MyTask();
		task.start();
		
		//job3
		for(int doc=1;doc<=10;doc++)
		{
			System.out.println("Printing documents #" +doc+ " printer 1");
		}
		
		//job4
		System.out.println("---------Application Terminated-----------");
	}
}