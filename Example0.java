class A implements Runnable
{
   public void run()
   {
     int i;
	 for(i=0;i<=10;i++)
	 {
	   System.out.println("Thread A: "+i);
	 }
   }
}
class B implements Runnable
{
   public void run()
   {
     int j;
	 for(j=0;j<=10;j++)
	 {
	   System.out.println("Thread B: "+j);
	 }
   }
}
public class Example0
{
  public static void main(String args[])
  {
    Thread t1=new Thread(new A());
	Thread t2=new Thread(new B());
	t1.start();
	t2.start();
   }
}   


	