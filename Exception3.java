class Exception3
{
  public static void main(String args[])
  {
   try
   {
     System.out.println(3/0);
	 System.out.println("Inside try block");
   }
   catch(ArithmeticException e)
   {
     System.out.println("Exception: "+e.getMessage());
   }
   System.out.println("Hello");
  }
}
	