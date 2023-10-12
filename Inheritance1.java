import java.util.Scanner;
class Base 
{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter the First number: ");
		a = sc.nextInt();
		System.out.println("Enter the Second number: ");
		b = sc.nextInt();
	}
}
class Derived extends Base
{
	public void display()
	{	
		sum=a+b;
		System.out.println("The sum of these two numbers is: " +sum);
	}
}
public class Inheritance1
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.accept();
		d.display();
	}
}