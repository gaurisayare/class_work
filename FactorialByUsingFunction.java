import java.util.Scanner;
class FactorialByUsingFunction
{
  int num,f=1;
  void fact()
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter any Number:");
     num=s.nextInt();
     while(num>1)
     {
       f=f*num;
       num--;
     }
      System.out.println("Factorial="+f);
  }
  public static void main(String args[])
  {
    Factorial fa=new Factorial();
    fa.fact();
   }
}