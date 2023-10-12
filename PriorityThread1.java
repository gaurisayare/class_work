public class PriorityThread1 extends Thread
{
	public void run()
	{
		System.out.println("Running thread has priority as "+Thread.currentThread().getPriority());
		
	}
	
	public static void main(String args[])
	{
		PriorityThread1 t1 = new PriorityThread1();
		PriorityThread1 t2 = new PriorityThread1();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
}
