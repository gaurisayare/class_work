/*Create a class Shape with fields length, breadth, radius and other two classes rectangle and circle extending from that shape class.
Apply other methods to calculate area of rectangleand circle*/

import java.util.Scanner;
class Shape
{
	double length, breadth, radius;
	
	Scanner sc = new Scanner(System.in);
	public void forRectangle()
	{
		System.out.println("Enter the length of rectangle: ");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of rectangle: ");
		breadth = sc.nextDouble();
	}
	public void forCircle()
	{
		System.out.println("Enter radius of circle: ");
		radius= sc.nextDouble();
	}
			
}

class Rectangle extends Shape
{
	public  double area()
	{
		return length*breadth;
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle is: "+2*(length+breadth));
	}
}

class Circle extends Shape
{
	public  double area()
	{
		return 3.14*radius*radius;
	}
	public void perimeter()
	{
		System.out.println("Perimeter of circle is: "+2*3.14*radius);
	}
}
public class HierarInherit2
{
	public static void main(String args[])
	{
		Shape obj = new Shape();       
		obj.forRectangle();								
		
		Rectangle recobj = new Rectangle();
		recobj.length = obj.length;
		recobj.breadth = obj.breadth;										
		System.out.println("Area of Rectangle: "+recobj.area());
		recobj.perimeter();
		
		obj.forCircle();
		Circle cirobj = new Circle();
		cirobj.radius = obj.radius;							
		System.out.println("Area of Square: "+cirobj.area());
		cirobj.perimeter();
		
	}
}
