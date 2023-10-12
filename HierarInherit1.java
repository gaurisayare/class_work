/*Create a class Shape with fields length, breadth, radius and other two classes rectangle and circle extending from that shape class.
Apply other methods to calculate area of rectangleand circle*/

import java.util.Scanner;
class Shape
{
	double length;
	double breadth;
	double radius;
}

class Rectangle extends Shape
{
	public  double calculateArea()
	{
		return length*breadth;
	}
}

class Circle extends Shape
{
	public  double calculateArea()
	{
		return 3.14*radius*radius;
	}
}

public class HierarInherit1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Rectangle recobj = new Rectangle();
		System.out.println("Enter length of the rectangle: ");
		recobj.length = sc.nextDouble();
		System.out.println("Enter breadth of the rectangle: ");
		recobj.breadth = sc.nextDouble();
		System.out.println("Area of Rectangle: "+recobj.calculateArea());
		
		Circle cirobj = new Circle();
		System.out.println("Enter radius of circle: ");
		cirobj.radius = sc.nextDouble();
		System.out.println("Area of Circle: "+cirobj.calculateArea());
		
	}
}