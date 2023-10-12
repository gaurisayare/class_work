package Empdetails;
import java.util.Scanner;
public class Emp1
{
	private int empId;
	private String empName;
	private String empDesignation;
	
	public Emp1(int empId, String empName, String empDesignation)
	{
		this.empId =  empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	
	public void displayDetails()
	{
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Designation: "+empDesignation);
	}
}