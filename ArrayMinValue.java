//WAJP to accept 5 values from user and find minimum value from them.

import java.util.Scanner;
public class ArrayMinValue
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int[] a=new int[5];           //Array declaration 
		
		System.out.println("Enter five Values");
		for(i=0;i<5;i++)      
		{
			a[i]=sc.nextInt();
		}
		
		int minValue = a[0];
		
		for(i=1;i<5;i++)
		{
			if(a[i] < minValue)
			{
				minValue = a[i];
			}
		}
		System.out.println("Minimum Value is: "+minValue);
	
	}
	
}