//Mr.john wants to buy a car but he needs color of the car are blue in car showroom 
//there are black white red and blue cars are available. Now accept some basic information from user and 
//based on that make a decision whether new car is available or not
import java.util.Scanner;
class Car
{
	public static void main(String args[])
	{
		String Cust_name, brand, color;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of a customer: ");
		Cust_name = sc.nextLine();
		
		System.out.println("Enter the color of car which you want to buy: ");
		color = sc.nextLine();
		
		if(color.equals("blue")) //string comparison is not happen by using == it is happen like this..
		
			System.out.println("Congradulations you purchased your dream car of blue color toyota brand!!!!");
			
		else if(color.equals("black"))
		
			System.out.println("Congradulations you purchased your dream car of black color!!!!");
		
		else if(color.equals("red"))
		
			System.out.println("Congradulations you purchased your dream car of red color..");
		
		else if(color.equals("white"))
		
			System.out.println("Congradulations you purchased your dream car of white color..");
		
		else
		
			System.out.println("You entered color is not available in the showroom!!");
		
		
	}
}