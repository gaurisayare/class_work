//WAP to swap two numbers without using third variable using class and objects.

import java.util.Scanner;

class NumberSwapper
{
	//Method to swap two numbers
	public void swapNumbers(int a,int b)
	{
		System.out.println("Before swapping: a = "+a+", b = "+b);
		
		//Logic to perform swapping without using third variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping: a = "+a+", b = "+b);
	}
}
 public class SwapNum
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Accepting the value of first number from user
		System.out.println("Please enter the value of First Number: ");
		int a = sc.nextInt();
	    
		//Accepting the value of second number from user
		System.out.println("Please enter the value of Second Number: ");
		int b = sc.nextInt();
		
		//Create an instance i.e. object of the NumberSwapper class 
		NumberSwapper swap = new NumberSwapper();
		
		//Use the swap object to swap numbers by calling the swapNumbers method.
		swap.swapNumbers(a, b);
	}
 }