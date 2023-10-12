/*WAJP to find area of circle rectangle and square*/

import java.util.Scanner;
class Area
{
	double side, radius, area, length, breadth;
	Scanner sc= new Scanner(System.in);
	
	//to find area of square
	public void areaSquare()      
	{
	    System.out.println("Enter the side of square: ");
		side = sc.nextDouble();
		area = side*side;
		System.out.println("The area of square is : "+area);
	}
	
	//to find area of rectangle
	public void areaRectangle()    
	{
		System.out.println("Enter the length and breadth of rectangle: ");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		area = length*breadth;
		System.out.println("The area of rectangle is : "+area);
	}
	
	//to find area of circle
	public void areaCircle()   
	{
		System.out.println("Enter the radius of circle: ");
		radius = sc.nextDouble();
		area = 3.14*radius*radius;
		System.out.println("The area of circle is : "+area);
	}
	
}
class AreaOfhapes
{
	public static void main(String args[])
	{
		Area obj=new Area();     //object creation
		obj.areaSquare();
		obj.areaRectangle();
		obj.areaCircle();
		
	}
}