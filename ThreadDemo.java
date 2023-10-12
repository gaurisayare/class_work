public class ThreadDemo
{
  public static void main(String args[]) throws Exception
  {
    Thread t1=new Thread(()->
	{
	  for(int i=1;i<=5;i++)
	  {
	    System.out.println("HIIIII");
		try
		{
		  Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	  }
    });
	Thread t2=new Thread(()->
	{
	  for(int i=1;i<=5;i++)
	  {
	    System.out.println("HELLO");
		try
		{
		  Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	  }
    });
	t1.setName("Gauri");
	t2.setName("Shona");
	System.out.println(t1.getName());
	System.out.println(t2.getName());
    t1.start();
    t2.start();
    t1.join();
    t2.join();
   System.out.println("BY");
  }
}	