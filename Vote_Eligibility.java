//program to check whether user is eligible for vote or not
import java.util.Scanner;

public class Vote_Eligibility
{
   public static void main(String args[])
   {
    int age;//variable declaration
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age of a person");
	age=sc.nextInt();
	
	if(age>=18)  //this returns boolean expression True or False
	{
	  System.out.println("Person is eligible to vote.");
	}
	else
	{	
	  System.out.println("Person is not eligible to vote.");
    }
   }
}