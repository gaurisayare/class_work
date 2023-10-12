package infopack;
import java.util.Scanner;
class User
{
	public static void main(String args[])
	{
		String name;
		int age;
		int id;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your id: ");
		id = sc.nextInt();
		
		System.out.println("Your name is: "+name);
		System.out.println("Your age is: "+age);
		System.out.println("Your id is: "+id);
	}
}