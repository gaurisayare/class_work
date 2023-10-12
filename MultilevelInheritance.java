import java.util.*;
class Base
{
	int num1, num2, res;
	Scanner sc = new Scanner(System.in);
	public void inputData()
	{
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
	    num2 = sc.nextInt();
	}
}
class D1 extends Base
{
	public void calc()
	{
		res=num1+num2;
	}
}
class D2 extends D1
{
	public void display()
	{
		System.out.println("The Output is " +res);
	}
}
public class MultilevelInheritance
{
	public static void main(String args[])
	{
		D2 obj = new D2();
		obj.inputData();
		obj.calc();
		obj.display();
	}
}