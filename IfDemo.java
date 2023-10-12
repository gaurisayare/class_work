//to validate the input conditional statements are used
import java.util.Scanner;

public class IfDemo
{
   public static void main(String args[])
   {
    int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	
	if(num>0)  //this returns boolean expression True or False
	{
	  System.out.println("Welcome to java Programming");
	}
	
	System.out.println("You Enjoy");
   }
}