package vehicles;
public class CarNew implements Vehicle
{
	public void run()
	{
		System.out.println("Car is running");
	}
	public void speed()
	{
		System.out.println("Speed of car is 50km/h");
	}
	public static void main(String args[])
	{
		CarNew c = new CarNew();
		c.run();
		c.speed();
		System.out.println("Hello World");
	}
}