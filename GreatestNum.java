//program to check whether user is eligible for vote or not
import java.util.Scanner;

public class GreatestNum
{
   public static void main(String args[])
   {
    int a,b;//variable declaration
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of first number a= ");
	a=sc.nextInt();
	
	System.out.println("Enter the value of second number b= ");
	b=sc.nextInt();
	
	if(a>b)  //this returns boolean expression True or False
	{
	  System.out.println("a="+a+" is greatest among a and b");
	}
	else
	{	
	  System.out.println("b="+b+" is greatest among a and b");
    }
	
   }
}