//WAJP that calculate the factorial of a number using while loop
import java.util.Scanner;
class Factorial2
{
  public static void main(String args[])
  {
     long num,fact=1;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter any Number:");
     num=s.nextLong();
     while(num>1)
     {
       fact=fact*num;
       num--;
     }
      System.out.println("Factorial="+fact);
	}
}