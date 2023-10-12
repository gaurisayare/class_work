//WAP to generate Marksheet of a student based on his personal details and secured marks. Create PersonalInfo class
//for accepting student personal information and create another class marksInfo for accepting student marks details 
//and finally create result class to display all above class information using multilevel inheritance.

import java.util.*;
class PersonalInfo
{
	int std, roll_no, m1, m2, m3, m4, m5, m6 ,total;
	double percent;
	String  name;
	Scanner sc = new Scanner(System.in);
	public void inputData()
	{
		System.out.println("Please enter your Name: ");
		name=sc.next();
		sc.nextLine();
		System.out.println("Enter class in which u studying: ");
		std = sc.nextInt();
	    System.out.println("Enter your roll number ");
		roll_no = sc.nextInt();
	}
}
class MarksInfo extends PersonalInfo
{
	public void marksDetails()
	{
		System.out.print("Enter marks of first subject you got out of 100: ");
		m1 = sc.nextInt();
		System.out.print("Enter marks of second subject you got out of 100: ");
		m2 = sc.nextInt();
		System.out.print("Enter marks of third subject you got out of 100: ");
		m3 = sc.nextInt();
		System.out.print("Enter marks of fourth subject you got out of 100: ");
		m4 = sc.nextInt();
		System.out.print("Enter marks of fifth subject you got out of 100: ");
		m5 = sc.nextInt();
		System.out.print("Enter marks of sixth subject you got out of 100: ");
		m6 = sc.nextInt();
		total = m1+m2+m3+m4+m5+m6;
	}
	public void grades()
	{
		if(total<600 && total>100)
		{
		
		    if(total<600 && total>450)
		
			{
				System.out.println(";ou passed with grade A+");
			}
			if(total<450 && total>300)
			{
				System.out.println("You passed with grade Grade A");
			}
			if(total<300 && total>250)
			{
				System.out.println("You passed with grade Grade B");
			}
			if(total<250 && total>100)
			{
				System.out.println("You passed with grade Grade C");
			}
		}
		else
		{
			System.out.println("Fail!!!!!");
		}
		
	}
}
class Result extends MarksInfo
{
	public void display()
	{
		System.out.println(" ");
		System.out.println("Your name is: "+name);
		System.out.println("Your roll number is: "+roll_no);
		System.out.println("You studying in class: "+std);
		System.out.println("--------------------------------------- ");
		System.out.println(" ");
		System.out.println("You obtained "+total+" marks in total.");
	}
}
public class MultilevelInheritance1
{
	public static void main(String args[])
	{
		Result obj = new Result();
		obj.inputData();
		obj.marksDetails();
		obj.display();
		obj.grades();
	}
}   