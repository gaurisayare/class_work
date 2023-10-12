//WAP to calculate area of rectangle area of square and area of circle using method overloading.

class AreaCalculator
{
    public double calculateArea(double length, double breadth)
	{
		return length*breadth;
	}
	
	public int calculateArea(int side)
	{
		return side*side;
	}
	
	public double calculateArea(double radius)
	{
		return 3.14*radius*radius;
	}
}


public class MethodOverloading2
{
	public static void main(String args[])
	{
		AreaCalculator obj = new AreaCalculator();
		//This will call the first calculateArea method
		System.out.println("Area of rectangle: "+obj.calculateArea(10,20));
		//This will call the second calculateArea method
		System.out.println("Area of square: "+obj.calculateArea(5));
		//This will call the third calculateArea method
		System.out.println("Area of circle: "+obj.calculateArea(8));
	}
}