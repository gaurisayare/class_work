//understating the class and objects 

import java.util.Scanner;
class PersonInfo
{
	int id;
	String p_name;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name and Id: ");
		p_name=sc.nextLine();
		id=sc.nextInt();
	}
	public void display()
	{
	System.out.println("YOU ARE WELCOME TO THE ORGANIZATION!!!!"+p_name+" your id is "+id);
	}
	public static void main(String args[])
	{
		PersonInfo obj = new PersonInfo();          //object declaration (object is a runtime entity)
		obj.accept();
		obj.display();
	}
}