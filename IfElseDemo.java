//to validate the input conditional statements are used
import java.util.Scanner;

public class IfElseDemo
{
   public static void main(String args[])
   {
    int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	num=sc.nextInt();
	
	if(num>0)  //this returns boolean expression True or False
	{
	  System.out.println("You have entered positive integer "+num);
	}
	else
	{	
	  System.out.println("You have entered negative number "+num);
    }
	
   }
}