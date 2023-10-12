//program to check whether the number is even or odd
import java.util.Scanner;

public class Even_Odd
{
   public static void main(String args[])
   {
    int num;//variable declaration
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a number= ");
	num=sc.nextInt();
	
	if(num%2==0)  //if any number divided by 2 gives remainder 0 is even number else it is odd number
	{
	  System.out.println("num= "+num+" is EVEN number.");
	}
	else
	{	
	  System.out.println("num= "+num+" is ODD number.");
    }
	
   }
}