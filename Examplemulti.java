class A extends Thread
{
  public void run()
  {
    int i;
	for(i=1;i<=10;i++)
    {
      System.out.println("i=="+i+"Thread A");
    }
  }
}
class B extends Thread
{
  public void run()
  {
    int j;
	for(j=1;j<=10;j++)
	{
      System.out.println("j=="+j+"Thread B");
    }
  }
}
public class Examplemulti
{
  public static void main(String args[])
  {
    A obj=new A();
	B obj1=new B();
	obj.start();
	obj1.start();
  }
}