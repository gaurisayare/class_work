class InvalidStandard extends Exception
{
  InvalidStandard(String s)
  {
    super(s);
  }
}
public class CustomException1
{
  public static void main(String args[])
  throws InvalidStandard
  {
    int standard=Integer.parseint(args[0]);
	if(standard<12||standard>12)
	{
	   throw new InvalidStandard("Your are not Eligible");
	}
	elses
	{
	  System.out.println("WELCOME");
	}
  }
}