import java.util.Scanner;
class Account
{
  private int bal;
  public Account(int bal)
  {
    this.bal=bal;
  }
  public boolean isSufficientBalance(int w)
  {
    if(bal>w)
	return(true);
	else
	return(false);
  }
  public void withdraw(int amt)
  {
    bal=bal-amt;
	System.out.println("Withdraw money is :"+amt);
	System.out.println("Your Current Balance is :"+bal);
  }
}
class Customer implements Runnable
{
  String name;
  private Account account;
  public Customer(Account account, String n)
  {
    this.account=account;
	name=n;
  }
  public void run()
  {
    Scanner kb=new Scanner(System.in);
	System.out.println(name+",Enter amout to withdraw");
	
	int amt=kb.nextInt();
	synchronized(account){
	if(account.isSufficientBalance(amt))
	{
	  System.out.println(name);
	  account.withdraw(amt);
	}
	else
	{
	  System.out.println("Insufficient Balance");
	}}
  }
}
public class ThreadExample
{
  public static void main(String args[])
  {
    Account a1=new Account(2000);
	Customer c1=new Customer(a1,"Gauri"),c2=new Customer(a1,"Rabbit");
	Thread t1=new Thread(c1);
	Thread t2=new Thread(c2);
	t1.start();
	t2.start();
  }
}