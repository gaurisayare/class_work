//WAP to accept 5 inputs for two arrays and add them.

import java.util.Scanner;
public class ArrayAdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int[] a = new int[5];
		int[] b = new int[5];
		int[] sumArray = new int[5];
		
		System.out.println("Enter five Values for array 1: ");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter five Values for array 2: ");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("Addition of two array is: ");
		for(i=0;i<5;i++)
		{
			sumArray[i] = a[i] +b[i];
			System.out.println(sumArray[i]);
		}
		
	}
	
}