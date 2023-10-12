//Array is linear data structure which stores elements of same kind in contiguous memory location/
import java.util.Scanner;
public class ArrayDemo
{
	public static void main(String args[])
	{
		int i;
		int[] a=new int[5];           //Array declaration 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five Values");
		for(i=0;i<5;i++)      
		{
			a[i]=sc.nextInt();
		}
		System.out.println("You have entered: ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[5]);
		}
	}
	
}