//WAP to create basic calculator using switch case
import java.util.Scanner;
class ScCalculator
{
	public static void main(String args[])
	{
		double num1, num2, output;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number for operation on numbers:  \n 1 for Addition \n 2 for Substraction \n 3 for Multiplication \n 4 for Division ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		   case 1:
			System.out.println("Enter First number: ");
			num1 = sc.nextDouble();
			System.out.println("Enter Second number: ");
			num2 = sc.nextDouble();
			output = num1 + num2;
			System.out.println(output);
			break;
			
		   case 2:
		    System.out.println("Enter First number: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second number: ");
			num2 = sc.nextInt();
			output = num1 - num2;
			System.out.println(output);
			break;
		  
		   case 3:
		    System.out.println("Enter First number: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second number: ");
			num2 = sc.nextInt();
			output = num1 * num2;
			System.out.println(output);
			break;
			
		   case 4:
		    System.out.println("Enter First number: ");
			num1 = sc.nextInt();
			System.out.println("Enter Second number: ");
			num2 = sc.nextInt();
			output = num1 / num2;
			System.out.println(output);
			break;
			
		   default:
				System.out.println("You have entered Wrong operator.");
				return;
		}
	}
}