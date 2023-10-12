/*WAP to implement hierarchical inheritance. Create a class Employee with field id, name, salary.
Create two more classes PermanentEmp and ContractEmp in that add hike() method to display percentage hike
in salary.*/

import java.util.Scanner;
class Employee
{
	int id;
	String name;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter your id: ");
		id = sc.nextInt();
		System.out.println("Enter your name: ");
		name= sc.next();
		System.out.println("Enter your salary: ");
		salary = sc.nextDouble();
		
	}
	public void printData()
	{
		System.out.println("Your ID is: "+id);
		System.out.println("Your Name is: "+name);
		System.out.println("Your Salary is: "+salary);
	}
}

class PermanentEmp extends Employee
{
	void hike()
	{
		double hikeAmount = salary*0.10;
		salary= salary+hikeAmount;
		System.out.println("Permanent Employee "+name+" got a hike of 10%. New Salary: "+salary);
	}
	
}

class ContractEmp extends Employee
{
	void hike()
	{
		double hikeAmount = salary*0.05;
		salary= salary+hikeAmount;
		System.out.println("Contract Employee "+name+" got a hike of 5%. New Salary: "+salary);
	}
	
}

public class HierarInherit
{
	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.accept();
		if(emp.id >=1 && emp.id<=100)
		{
		    PermanentEmp pe = new PermanentEmp();
			pe.id = emp.id;
			pe.name = emp.name;
			pe.salary = emp.salary;
		    pe.hike();
		}
		else
		{
            ContractEmp ce = new ContractEmp();
			ce.id = emp.id;
			ce.name = emp.name;
			ce.salary = emp.salary;
		    ce.hike();
		}
		
		
	}
}