//WAP to check whether the number is pallindrome or not
import java.util.Scanner;
class Pallindrome
{		
	public static void main(String args[])
	{
		int rem, rev=0, temp, num, num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num1 = sc.nextInt();
		num=num1;
		temp=num;
		
	while(num>0)
	{
		rem = num%10;
		rev = rev*10+rem;
		num=num/10;
	}
	
	if(temp == rev)
	{
		System.out.println("Number is Pallindrome!!!!");
	}
	else
	{
		System.out.println("Number is not Pallindrome!!!!");
	}
	}
}