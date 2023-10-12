class Exception4
{
  public static void main(String args[])
  {
   int balance=5000;
   int want=8000;
   if (balance<want)
   throw new ArithmeticException("Insufficient Balance");
   balance=balance-want;
   System.out.println("Transaction Completed");
   System.out.println("Program Continue.........");
   }
}
	