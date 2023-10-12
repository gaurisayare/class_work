
import java.util.Scanner;
class Car1
{
	public static void main(String args[])
	{
		String Cust_name, brand, color;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of a customer: ");
		Cust_name = sc.nextLine();
		
		System.out.println("Enter the color of car which you want to buy: ");
		color = sc.nextLine();
		
		switch(color)
		{
		    case "Blue":
				System.out.println("Congradulations you purchased your dream car of toyota brand of blue color!!!!");
				break;
			
			case "Black":
				System.out.println("Congradulations you purchased your dream car of black color!!!!");
				break;
				
		    case "Red":
				System.out.println("Congradulations you purchased your dream car of red color!!!!");
				break;
			
			case "White":
				System.out.println("Congradulations you purchased your dream car of white color!!!!");
				break;
		   
			
		   default:
				System.out.println("You entered color is not available in the showroom!!");
				break;
		}
	}
}