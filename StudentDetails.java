/*WAJP that checks basic information of student and display the same. 
Add two more methods in the same program which are related to student class.*/

import java.util.Scanner;
class Student1
{
	String name;
	int rollno;
	int age;
	Scanner sc = new Scanner(System.in);
	
	//getting the data from user
	public void input()
	{
		System.out.println("Enter Name of the Student: ");
		name = sc.nextLine();
		System.out.println("Enter Roll number of the Student: ");
		rollno = sc.nextInt();
		System.out.println("Enter Age of the Student: ");
		age = sc.nextInt();
		
	}
	
	//printing of student information
	public void info()      
	{
	    System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("Age: "+age);
		
	}
	
	//for totaling all marks of the student
	public void total()   
	{
		System.out.println("Enter the marks of 5 subjects of " +name+ ": ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int total = (m1+m2+m3+m4+m5);
		System.out.println("Overall total of marks of " +name+ " is: "+total);
	}
	
	public void voteeligibility()
	{
		if(age>=18)
		{
			System.out.println(name+ " is eligible for voting");
        }
        else
	    {
			System.out.println("You are not eligible to vote");
		}
	}
}

class StudentDetails
{
	public static void main(String args[])
	{
		Student1 obj=new Student1();     //object creation
		obj.input();                    //calling methods
		obj.info();
		obj.total();
		obj.voteeligibility();
	}
	
}