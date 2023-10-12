/*Create a bank class with withdraw and deposit methods.
Assign balance amount and perform the said Operations*/

import java.util.Scanner;
class Bank
{
	double balanceamt=50000, withdrawamt, depositamt;
	String name;
	int accountnum;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Please enter Your Name: ");
		name= sc.next();
		System.out.println("Please enter your account number: ");
		accountnum= sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("Your Name is : "+name);
		System.out.println("Your account number is: "+accountnum);
	}
}

class WithdrawDeposit extends Bank
{
	public void withdrawamount()
	{
		System.out.println("Your balance amount is: "+balanceamt);
		System.out.println("How much amount u want to withdraw: ");
		withdrawamt=sc.nextDouble();
		balanceamt = balanceamt-withdrawamt;
		System.out.println("Total balance amount is: "+balanceamt);
	}

	public void depositamount()
	{
		System.out.println("Your balance amount is: "+balanceamt);
		System.out.println("How much amount u want to deposit: ");
		depositamt=sc.nextDouble();
		balanceamt = balanceamt+depositamt;
		System.out.println("Total balance amount is: "+balanceamt);
	}
}

class InheritBank
{
	public static void main(String args[])
	{
		WithdrawDeposit wd = new WithdrawDeposit
		wd.accept();
		wd.display();
		wd.withdrawamount();
		wd.depositamount();
	}	
}
 