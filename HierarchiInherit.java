/*Create a superclass called "Shape" with properties like "numSides" and "color". 
Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and 
have additional properties like "sideLengths" for triangle and square, and "radius" for the circle.
Write a Java program to display the details of a triangle, a square, and a circle.*/

import java.util.Scanner;

// Base class "Shape" to store common properties of shapes
class Shape 
{
    protected int numSides; // Number of sides of the shape
    protected String color; // Color of the shape

    // Method to accept common details for all shapes
    public void acceptDetails() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        numSides = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter color: ");
        color = sc.nextLine();
    }

    // Method to display common details of all shapes
    public void displayDetails() 
	{
        System.out.println("Number of Sides: " + numSides);
        System.out.println("Color: " + color);
    }
}

// Subclass "Triangle" inheriting from "Shape"
class Triangle extends Shape 
{
    private double[] sideLengths; // Lengths of the sides of the triangle

    // Method to accept specific details for triangle
    public void acceptDetails() 
	{
        super.acceptDetails(); // Call the superclass method to accept common details
        sideLengths = new double[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) 
		{
            System.out.print("Enter side " + (i + 1) + " length: ");
            sideLengths[i] = sc.nextDouble();
        }
    }

    // Method to display specific details of a triangle
    @Override
    public void displayDetails() 
	{
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Side Lengths: " + sideLengths[0] + ", " + sideLengths[1] + ", " + sideLengths[2]);
    }
}

// Subclass "Square" inheriting from "Shape"
class Square extends Shape 
{
    private double sideLength; // Length of the sides of the square

    // Method to accept specific details for square
    public void acceptDetails() 
	{
        super.acceptDetails(); // Call the superclass method to accept common details
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length: ");
        sideLength = sc.nextDouble();
    }

    // Method to display specific details of a square
    @Override
    public void displayDetails() 
	{
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Side Length: " + sideLength);
    }
}

// Subclass "Circle" inheriting from "Shape"
class Circle extends Shape
 {
    private double radius; // Radius of the circle

    // Method to accept specific details for circle
    public void acceptDetails() 
	{
        super.acceptDetails(); // Call the superclass method to accept common details
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }

    // Method to display specific details of a circle
    @Override
    public void displayDetails() 
	{
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Radius: " + radius);
    }
}

// Main class to demonstrate shape details
public class HierarchiInherit 
{
    public static void main(String[] args) 
	{
        Triangle triangle = new Triangle();
        System.out.println("Enter Triangle Details");
        triangle.acceptDetails();
		
		System.out.println("---------------------------");
		
        Square square = new Square();
        System.out.println("Enter Square Details:");
        square.acceptDetails();

		System.out.println("---------------------------");
		
        Circle circle = new Circle();
        System.out.println("Enter Circle Details:");
        circle.acceptDetails();
		
		System.out.println("---------------------------");

        System.out.println("\nTriangle Details:");
        triangle.displayDetails();

        System.out.println("\nSquare Details:");
        square.displayDetails();

        System.out.println("\nCircle Details:");
        circle.displayDetails();
    }
}
