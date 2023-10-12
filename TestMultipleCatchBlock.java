public class TestMultipleCatchBlock
{ 
  public static void main(String args[])
  { 
    try
	{
	  int a[]=new int[5];
	  a[5]=30/0;
	}
	catch(ArithmeticException e)
	{
	  System.out.println("Task 1  is Completed");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	  System.out.println("Task 2 is Completed");
	}
	catch(Exception e)
	{
	  System.out.println("Common Task Completed");
	}
	System.out.println("Rest.....");
  }
}