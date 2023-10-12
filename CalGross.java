//Calculate total salary of Employee

import java.util.Scanner;
class CalGross
{
   public static void main(String args[])
   {
      //variable declaration
      int basicSal;
	  float da;
	  double hra,gross;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your Basic Salary: ");
	  basicSal=sc.nextInt();
	  System.out.println("Enter your daily allowance: ");
	  da=sc.nextFloat();
	  System.out.println("Enter your hra: ");
	  hra=sc.nextDouble();
	  
	  gross=basicSal+da+hra;
	  System.out.println("The Total Salary is: "+gross);
	  sc.close();
	}
}