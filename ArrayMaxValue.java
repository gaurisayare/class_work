//WAJP to accept 5 values from user and find maximum value from them.

import java.util.Scanner;
public class ArrayMaxValue
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
		
		int maxValue = a[0];
		
		for(i=1;i<5;i++)
		{
			if(a[i] > maxV
			alue)
			{
				maxValue = a[i];
			}
		}
		System.out.println("Maximum Value is: "+maxValue);
	
	}
	
}