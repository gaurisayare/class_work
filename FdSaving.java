//WAP to calculate interest rate of fixed deposit or saving interest based on choice provided by user whether he wants to keep money for fixed deposit or 
//saving. Interest rate for fixed deposit is 7% and for saving it is 3.5%
import java.util.Scanner;
class FdSaving
{
	public static void main(String args[])
	{
		String cust_name;
		int principle_amt, time, ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of a customer: ");
		cust_name = sc.nextLine();
		
		System.out.println("Enter the Principle amount: ");
		principle_amt = sc.nextInt();
		
		System.out.println("Enter the Time period for which you want keep money: ");
		time = sc.nextInt();
		
		System.out.println("Rate of Interest for Fixed deposit is 7% and saving is 3.5%");
		
		System.out.println("Write 1 for Fixed Deposit and 2 for Saving: ");
		ch = sc.nextInt();
		
		switch(ch)
		{
		    case 1:
				System.out.println("Interest Rate for Fixed deposit is 7%");
				System.out.println("Simple Interest on Rs"+principle_amt+" for time period "+time+" is: "+principle_amt*7*time);
				break;
			
			case 2:
				System.out.println("Interest Rate for Saving is 3%");
				System.out.println("Simple Interest on Rs"+principle_amt+" for time period "+time+" is: "+principle_amt*3.5*time);
				break;
				
		    default:
				System.out.println("You entered option is not available right now.");
				break;
		}
	}
}