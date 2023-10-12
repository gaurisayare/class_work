/*Write a java Program to create class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the method getArea() method 
to calculate the area of a rectangle.*/

import java.util.Scanner;

// Shape class with a method to get area and some details
class Shape 
{
    protected double length;
    protected double breadth;

    // Method to set details for Shape
    public void setDetails(double length, double breadth) 
	{
        this.length = length;
        this.breadth = breadth;
    }

    // Method to get area (default implementation)
    public double getArea() 
	{
        return 0; // Default implementation, will be overridden by subclasses
    }
}

// Subclass Rectangle that inherits from Shape
class Rectangle extends Shape 
{
    // Overriding getArea() method to calculate rectangle's area
    @Override
    public double getArea() 
	{
        return length * breadth;
    }
}

public class ShapeOverride 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double breadth = sc.nextDouble();

        rectangle.setDetails(length, breadth);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);

    }
}