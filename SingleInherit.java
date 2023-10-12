/*Create a class Student having roll _number, Name as a fiels. Create another class Marksdetails to accepct 5 subject marks. 
Apply Single inheritance to display the result.*/

import java.util.Scanner;

//Parent class: Student
class Student
{
	int rollNumber;
	String name;
	
	//Constructor to initialize name and roll Number
	public Student(int rollNumber, String name)     //as it is constructor it doesnot have any return type
	{
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	//method to display student information
	public void displayStudentInfo()
	{
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Your Name: "+name);
	}
}

//Child class: MarksDetails
class MarksDetails extends Student
{
	int marks1, marks2, marks3, marks4, marks5;
	
	//Constructor to initialise roll number, name and marks.
	public MarksDetails(int rollNumber, String name,int marks1, int marks2, int marks3, int marks4, int marks5)
	{
		super(rollNumber, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.marks4 = marks4;
		this.marks5 = marks5;
	}
	
	//Method to Calculate and Display the total marks and average
	public void calculateDisplayResult()
	{
		int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
		double averageMarks = totalMarks/5.0;
		
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average Marks: "+averageMarks);
	}
}
public class SingleInherit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n");
	    System.out.println("---------------------W_E_L_C_O_M_E-----------------------");

		System.out.print("\n");
		
		//Accepting roll number and name from user.
		System.out.print("Please enter your Roll Number: ");
		int rollNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("---------------------------------------------------------");
		
		//Accepting the marks obtaimned by the student in all the 5 subjects
		System.out.print("Please enter marks for Subject 1 that you get out of 100: ");
		int marks1 = sc.nextInt();
		
		System.out.print("Please enter marks for Subject 2 that you get out of 100: ");
		int marks2 = sc.nextInt();
		
		System.out.print("Please enter marks for Subject 3 that you get out of 100: ");
		int marks3 = sc.nextInt();
		
		System.out.print("Please enter marks for Subject 4 that you get out of 100: ");
		int marks4 = sc.nextInt();
		
		System.out.print("Please enter marks for Subject 5 that you get out of 100: ");
		int marks5 = sc.nextInt();
		System.out.println("---------------------------------------------------------");
		
		//Creating an Instance of a class MarksDetails
		MarksDetails markdetails = new MarksDetails(rollNumber, name, marks1, marks2, marks3, marks4, marks5);
		
		//Display student information and result by calling methods by using object
		markdetails.displayStudentInfo();
		markdetails.calculateDisplayResult();
		System.out.print("---------------------------------------------------------");
	}
}