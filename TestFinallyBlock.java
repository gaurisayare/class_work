class TestFinallyBlock
{
  public static void main(String args[])
  {
    try
	{
	 String data=null;
	 System.out.println(data.length());
	}
	catch(NullPointerException e)
	{
	 System.out.println(e);
	}
	finally
	{
	  System.out.println("Finally Block is always executed");
	}
	System.out.println("Rest");
  }
}