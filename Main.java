//Calculations

import java.util.Scanner;
class Oops1
{
	double num1, num2, ans;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	
	public void addNum()      //method for addition of numbers
	{
		ans = num1+num2;
		System.out.println("The addition of two numbers is : "+ans);
	}
	
	public void subNum()     //method for substraction of numbers
	{
		ans = num1-num2;
		System.out.println("The substraction of two numbers is : "+ans);
	}
	
	public void multiNum()    //method for multiplication of numbers
	{
		ans = num1*num2;
		System.out.println("The multiplication of two numbers is : "+ans);
	}
	
	public void divNum()      //method for division of numbers
	{
		ans = num1/num2;
		System.out.println("The division of two numbers is : "+ans);
	}
}
class Main
{
	public static void main(String args[])
	{
		Oops1 obj=new Oops1();     //object creation
		obj.input();
		obj.addNum();
		obj.subNum();
		obj.multiNum();
		obj.divNum();
	}
}