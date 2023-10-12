//WAJP to create a class Person with data member has unique id age city and gender
// also include methods study, sleep and play.
import java.util.Scanner;
class Person
{
	String name, city, gender;
	int unique_id;
	int age;
	Scanner sc = new Scanner(System.in);
	
	//getting the data from user
	public void input()
	{
		System.out.println("Please enter your Name : ");
		name = sc.nextLine();
		System.out.println("Please enter your unique Id : ");
		unique_id = sc.nextInt();
		System.out.println("Please enter your age: ");
		age = sc.nextInt();
		System.out.println("Please enter the city where u are living: ");
		city = sc.next();
		System.out.println("Please enter your gender: ");
		gender = sc.next();
	}
	
	//printing of information
	public void info()      
	{
	    System.out.println("Name: "+name);
		System.out.println("Unique_id: "+unique_id);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		System.out.println("Gender: "+gender);

	}
	
	//Study class
	public void study()   
	{
		if(age>=18)
		{
			System.out.println(name+ " you can do work with your studies .");
        }
        else
	    {
			System.out.println("You have to focus on your studies.");
		}
	}
	
	//Sleep class
	public void sleep()
	{
		System.out.println(name+" sleep as early as u can and wake up as early as u can.");
	}
	
	//Play class
	public void play()
	{
		System.out.println(name+" Playing is important but not for long time and mostly choose outdoor games for physical health.");
	}
}

class PersonData
{
	public static void main(String args[])
	{
		Person obj=new Person();     //object creation
		obj.input();                    //calling methods
		obj.info();
		obj.study();
		obj.sleep();
		obj.play();
	}
	
}
