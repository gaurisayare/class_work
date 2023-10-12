//WAP  to calculate the armstrong number using loop
import java.util.Scanner;
class Armstrong
{		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int rem, sum=0, m = num;
		
	while(num!=0)
	{
		rem = num%10;
		sum = sum + (rem*rem*rem);
		num = num/10;
	}
	
	if(sum == m)
		System.out.println(m+ " is an Armstrong number.");
	else
		System.out.println(m+ "is not an Armstrong number.");
	}
}