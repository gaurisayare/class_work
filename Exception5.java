class Exception5
{
  public static void main(String args[])
  {
    int balance=5000;
	int want=6000;
	try
	{
	  if(balance<want)
	  throw new ArithmeticException("Insufficient Balance");
	  balance=balance-want;
	  System.out.println("Transaction Successful");
	}
	catch(ArithmeticException e)
	{
	  System.out.println("Exception: "+e.getMessage());
	}
	System.out.println("Continue......");
  }
}