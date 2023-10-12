/*Create a package Empdetails.Create a class Emp which has Field as Empid, EmpName, EmpDesignation.
Accept details from user and display the same.*/

import Empdetails.Emp1;
import java.util.Scanner;

public class Package1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id: ");
		int empId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter Employee Name: ");
		String empName = sc.next();
		
		System.out.print("Enter Employee Designation: ");
		String empDesignation = sc.next();
		
		Emp1 emp = new Emp1(empId, empName, empDesignation);
		
		System.out.println("\n Employee Details: ");
		emp.displayDetails();
		
	}
}