//WAJP to get car details from the user. Here properties to display are brand, modelname, topspeed and write corresponding getters setters

import java.util.Scanner;
public class CarBrand
{
	private String brand;
	private String modelName;
	private int topSpeed;
	
	public Car1(String brand, String modelName,int topSpeed)
	{
		this.brand = brand;
		this.modelName = modelName;
		this.topSpeed = topSpeed;
	}
	
	//getters
	public String getBrand()
	{
		return brand;
	}
	
	public String getModelName()
	{
		return modelName;
	}
	
	public int getTopSpeed()
	{
		return topSpeed;
		
	}
	
	//setters
	public void setBrand(String brand)
	{	
		this.brand = brand;
	}
	
	public void setModelName(String modelName)
	{	
		this.modelName = modelName;
	}
	
	public void setTopSpeed(int topSpeed)
	{	
		this.topSpeed = topSpeed;
	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car1 details: ");
		CarBrand car1 = getCarDetailsFromUser(scanner); 
		
		System.out.println("Enter Car2 details: ");
		CarBrand car2 = getCarDetailsFromUser(scanner); 
		
		System.out.println("\n Car 1 Details: ");
		displayCarDetails(car1);
		
		System.out.println("\n Car 2 Details: ");
		displayCarDetails(car2);
	}
	
	private static CarBrand getCarDetailsFromUser(Scanner sc)
	{
		System.out.println("Enter Brand: ");
		String brand = sc.nextLine();
		
	    System.out.println("Enter Model Name: ");
		String modelName = sc.nextLine();
		
		System.out.println("Enter top Speed: ");
		int topSZpeed = sc.nextInt();
		sc.nextLine();
		
		return new Car(brand, modelName, topSpeed);
	}
	
	private static void displayCarDetails(CarBrand car)
	{
		
		//get car details
		System.out.println("Brand: " +car.getBrand());
		System.out.println("Model: " +car.getModelName());
		System.out.println("Brand: " +car.getTopSpeed() + "km/h");
		
	}
}
