class CustomException6
{
  static void throwOne() throws IllegalAccessException
  { 
    System.out.println("Inside ThrowOne");
	throw new IllegalAccessException("Demo");
  }
  public static void main(String args[])
  try
  {
    throwOne();
  }
  catch(IllegalAccessException e)
  {
    System.out.println("Caught "+e);
  }
}