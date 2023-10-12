//WAP to accept numbers from user and find sum of digits using for loop
import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		int num, sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		for(sum=0;num!=0;num=num/10)        
		{
		    sum= sum + num%10;
		}
		System.out.println("Sum of digits:" +sum);
	}
}