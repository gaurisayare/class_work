//WAP to accept 7 inputs for array and print average of the elements in it. 

import java.util.Scanner;
public class ArrayElementsAverage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int[] a = new int[7];
        
		int sum = 0;
		System.out.println("Enter 7 elements: ");
		for(i=0;i<7;i++)
		{
			a[i]=sc.nextInt();
			sum = sum+a[i];
		}
		
		float average = (float) sum/7;
		System.out.println("Average of the elements in array is: "+average);
	}
	
}