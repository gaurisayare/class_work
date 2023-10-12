//WAJP to get car details from the user. 
//Here properties to display are brand, modelname, topspeed and write corresponding getters setters
//Atleast two car detailsshould be visible.
import java.util.Scanner;
public class CarBrand
{
	private String brand;
	private String modelName;
	private int topSpeed;
	
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
}
public class CarDetails
{
	
	public static void main(String [] args)
	{
		CarBrand car = new CarBrand();
		car.setbrand("Toyota");
		car.setmodelName("Fortuner");
		car.settopSpeed(310);
		
		System.out.println("Brand: " +car.getbrand());
		System.out.println("Model: " +car.getmodelName());
		System.out.println("Brand: " +car.gettopSpeed() + "km/h");
		
		CarBrand car1 = new CarBrand();
		car1.setbrand("Tesla");
		car1.setmodelName("Tesla Roadster");
		car1.settopSpeed(320);
		
		System.out.println("Brand: " +car.getbrand());
		System.out.println("Model: " +car.getmodelName());
		System.out.println("Brand: " +car.gettopSpeed() + "km/h");
		
	}
	
}
