//WAJP to get car details from the user. 
//Here properties to display are brand, modelname, topspeed and write corresponding getters setters
//Atleast two car details should be visible.

import java.util.Scanner;
class Carinfo
{
	//private variables
	private String brand;
	private String modelName;
	private int topSpeed;
	
	//setters
	public void setbrand(String brand)
	{	
		this.brand = brand;
	}
	
	public void setmodelName(String modelName)
	{	
		this.modelName = modelName;
	}
	
	public void settopSpeed(int topSpeed)
	{	
		this.topSpeed = topSpeed;
	}

	//getters
	public String getbrand()
	{
		return brand;
	}
	
	public String getmodelName()
	{
		return modelName;
	}
	
	public int gettopSpeed()
	{
		return topSpeed;
		
	}
}

	public class Cardetails
	{
	
		public static void main(String [] args)
		{
			//creating instance of a class i.e. object
			Carinfo car = new Carinfo(); 
			
			//First car details
			car.setbrand("Toyota");
			car.setmodelName("Fortuner");
			car.settopSpeed(310);
			
			System.out.println("Brand: " +car.getbrand());
			System.out.println("Model: " +car.getmodelName());
			System.out.println("Top Speed: " +car.gettopSpeed() + "km/h");
			
			// creating another instance of the same Carinfo class i.e. creating another object
			Carinfo car1 = new Carinfo(); 
			
			//Second Car details
			car1.setbrand("Hyundai");
			car1.setmodelName("Creta");
			car1.settopSpeed(195);
			
			System.out.println("Brand: " +car1.getbrand());
			System.out.println("Model: " +car1.getmodelName());
			System.out.println("Top Speed: " +car1.gettopSpeed() + "km/h");
			
		}
	
    }

