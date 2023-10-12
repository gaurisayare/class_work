public class TryCatchExample
{
	public static void main(String args[])
	{
		try
		{
			int data = 50/0;  //may throw exception
		}
		
		//Handling the exception by using Exception class
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("WELCOME TO CONCEPT OF EXCEPTION HANDLING");
	}
}
