public class PropertyThread implements Runnable
{
	public void run()
	{
	}
	
	public static void main(String args[])
	{
		Thread t1 = new Thread("mythread1");
		Thread t2 = new Thread("mysecondthread");
		t1.start();
		t2.start();
		System.out.println("Thread names are: ");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}
