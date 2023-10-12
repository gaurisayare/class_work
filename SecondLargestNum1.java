//WAP to find Second largest number in an array.

import java.util.Scanner;
public class SecondLargestNum1
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
		for(int i=0; i<n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				int tmp = 0;
				if(array[i]<array[j])
				{
					//logic for swapping the numbers in the array
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
				
			}
			//prints the sorted elements of the Array
		    //System.out.println(array[i]);
		}
		System.out.println("Second Largest number is: "+array[1]);
	}
}
