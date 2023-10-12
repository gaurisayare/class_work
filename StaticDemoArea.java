//Static variables and static methods

import java.util.Scanner;
class StaticDemoArea
{ 
	static double pi=3.14;    //static variable which cannot be changed it is fixed
	double area;
	int r;
	Scanner sc = new Scanner(System.in);
	public static void accept()       //static method
	{
		System.out.println("Hello ");  //in static method u have to use only static variables
	}
	
	public void calculate()
	{
		System.out.println("Enter the radius: ");
		r=sc.nextInt();
		area= pi*r;
		System.out.println("Area of crcle is: "+area);
	}
	
	public static void main(String args[])
	{
		StaticDemoArea obj = new StaticDemoArea();
	    StaticDemoArea.accept();          //static method should not called by reference of object it is called by using class name
		obj.calculate(); 
	}
}

/*
Static variables and static methods are two important concepts in java.
Whenever a variable is declared as a static, this means there is only one copy of it for the entire class ,
rather than ecah instance having its own copy. A ststic method means it can be called without creating an instance of the class.
Static variables and methodsin java provide several advantages, including memory efficiency, global access, objectindependence,
performance, and code organization.
Static method in java with example
The Static keyword is used to construct methods that will existsregardless of whether or not any instances of class are generated
Any method that uses the static keyword is reffered to as a static method.

Features of static method:
A static method in java is a method that is part of a class rathar than an instance of that class.
Every instance of a class has access to the method.
Static methods have access to class variables(static variables) without using the class object(instance).
Only static data may be accessed by a static metrhod. It is unable to access data that is not static(instance variables).
In both static and non Static methods, static methods can be accessed directly.
*/ 