class Rectangle1
{
	double length;
	double breadth;
	
	Rectangle1()
	{
		length = 15.5;
		breadth = 10.67;
	}
	void calculateArea()
	{
		System.out.println(length*breadth);
		//return length*breadth;
	}
}
class Constructor
{
	public static void main(String args[])
	{
		double area;
		Rectangle1 obj = new Rectangle1();
		area = obj.calculateArea();
		System.out.println("The Area of Rectangle: "+area);
	}
}