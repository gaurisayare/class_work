/*Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and 
implement the abstract methods. 
Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle.*/

import java.util.Scanner;

// Abstract class "Vehicle" with abstract methods
abstract class Vehicle 
{
    public abstract void start(); // Abstract method to start the vehicle
    public abstract void stop();  // Abstract method to stop the vehicle
}

// Subclass "Car" extending "Vehicle"
class Car extends Vehicle 
{
    @Override
    public void start() 
	{
        System.out.println("Starting the car...");
    }

    @Override
    public void stop() 
	{
        System.out.println("Stopping the car...");
    }
}

// Subclass "Motorcycle" extending "Vehicle"
class Motorcycle extends Vehicle 
{
    @Override
    public void start() 
	{
        System.out.println("Starting the motorcycle...");
    }

    @Override
    public void stop() 
	{
        System.out.println("Stopping the motorcycle...");
    }
}

// Main class to demonstrate vehicle operations
public class AbstractDemo 
{
    public static void main(String[] args) 
	{
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Display the menu options
        System.out.println("1. Start Car");
        System.out.println("2. Stop Car");
        System.out.println("3. Start Motorcycle");
        System.out.println("4. Stop Motorcycle");
        System.out.println("5. Exit");

        // Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
		{
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform actions based on user's choice
            switch (choice) 
			{
                case 1:
                    car.start();
                    break;
                case 2:
                    car.stop();
                    break;
                case 3:
                    motorcycle.start();
                    break;
                case 4:
                    motorcycle.stop();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } 
		while (choice != 5);
    }
}
