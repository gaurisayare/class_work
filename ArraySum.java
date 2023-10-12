//WAP to accept 7 inputs for array and print sum of the elements in it. 

import java.util.Scanner;
public class ArrayElementsSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int[] a = new int[7];

		System.out.println("Enter 7 elements: ");
		for(i=0;i<7;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int num: array)
		{
			sum = sum+num;
		}
		System.out.println("Sum of the elements in array is: "+sum);
	}
	
}