//WAP to find Second largest number in an array.
//BYCHATGPT

import java.util.Scanner;
public class SecondLargestNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elementsin the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<n; i++)
		{
			array[i]= sc.nextInt();
		}
		int largest = array[0];
		int secondLargest = array[0];
		
		for(int num : array)
		{
			if(num>largest)
			{
				secondLargest = largest;
				largest = num;
			}
			else if(num>secondLargest && num != largest)
			{
				secondLargest = num;
			}
		}
		
		if(secondLargest == largest)
		{
			System.out.println("There is no second largest element.");
		}
		else
		{
			System.out.println("The second Largest element is: " +secondLargest);
		}
	}
}
