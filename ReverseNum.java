//Wap to accept number from user and do reverse of it
import java.util.Scanner;
class ReverseNum
{
	public static void main(String args[])
	{
		int num, rev=0, rem;
		System.out.println("Enter an integer to reverse the number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)        
		{
			rem=num%10;
			rev=rev*10 + rem;
			num=num/10;
		}
		System.out.println("Reverse of the number is:" +rev);
	}
}