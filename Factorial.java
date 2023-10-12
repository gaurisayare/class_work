//WAJP that calculate the factorial of a number using while loop
import java.util.Scanner;
class Factorial
{
  public static void main(String args[])
  {
     int num,fact=1, i=1;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter any Number:");
     num=s.nextInt();
     while(i<=num)
     {
       fact=fact*i;
       i++;
     }
      System.out.println("Factorial="+fact);
	}
}