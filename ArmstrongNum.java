//WAP to check whether the number is armstrong or not using class and objects.

import java.util.Scanner;

class ArmstrongChecker
{
	//method to check whether the number is an Armstrong Number
	public void checkArmstrong(int number)
	{
		int originalNumber = number;
		int sum=0;
		//int numDigits = String.valueOf(number).length();
		
		//logic for finding armstrong number
		while(number>0)
		{
			int digit = number%10;
			sum= sum+(digit*digit*digit);
			number= number/10;
		}
		
		//Check if the sum is equal to the original number
		if(originalNumber == sum)
		{
			System.out.println(originalNumber+" is an Armstrong Number.");
		}
		else
		{
			System.out.println(originalNumber+" is not an Armstrong Number.");
		}
	}
}
public class ArmstrongNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		//Create an instance(object) of the ArmstrongChecker class 
		ArmstrongChecker armobj = new ArmstrongChecker();
		
		//use the armobj object to checkis the number is an Armstrong Number
		armobj.checkArmstrong(number);
	}
}