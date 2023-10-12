/*Write a Java program that reads an integer from the user using the Scanner class.
Handle the InputMismatchException that can occur if the user enters a non-integer value. 
Display an appropriate error message.*/

import java.util.*;
public class ImissMatchExc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a number");
			int a = sc.nextInt();
			System.out.println(a*a);
		}
		catch(InputMismatchException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("The expected input is an Integer Value!!");
		}
		
	}
}