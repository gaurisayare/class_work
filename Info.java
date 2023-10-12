/*
Name: Gauri
Address: Kondhali
Age: 21
Enter Name:
Gauri
Name: Gauri
Enter Address:
KOndhali
Address: KOndhali
Enter Age:
21
Age: 21
*/

import java.util.Scanner;
class Info
{
	String name;
	String address;
	int age;
	
	
	
	Scanner sc=new Scanner(System.in);
	void tellName()
	{
	  System.out.println("Enter Name: ");
	  name = sc.nextLine();
	  System.out.println("Name: "+name);
	}
	
	void tellAddress()
	{
		System.out.println("Enter Address: ");
		address = sc.nextLine();
		System.out.println("Address: "+address);
	}
	void tellAge()
	{
		System.out.println("Enter Age: ");
	    age = sc.nextInt();
	    System.out.println("Age: "+age);
	}
	public static void main(String args[])
	{
		Info obj = new Info();
		obj.name = "Gauri";
		obj.address = "Kondhali";
		obj.age = 21;
		System.out.println("Name: "+obj.name);
		System.out.println("Address: "+obj.address);
		System.out.println("Age: "+obj.age);
		
		//Info obj1 = new Info();
		obj.tellName();
		obj.tellAddress();
		obj.tellAge();
	}
}