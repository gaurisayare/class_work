import java.util.Scanner;
class Reverse
{
  int r,sum=0,a;
  public void reverse()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to reverse: ");
    a=s.nextInt();
    while(a>0)
    { 
      r=a%10;
      sum=(sum*10)+r;
      a=a/10;
    }
    System.out.println("Reverse Number: "+sum);
  }
}
class Biggest extends Reverse
{
   int x,y,z;
   public void condition()
   {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your First Number: ");
      x=s.nextInt();
      System.out.println("Enter your Second Number: ");
      y=s.nextInt();
      System.out.println("Enter your Third Number: ");
      z=s.nextInt();
      if(x>y && x>z)
      {
        System.out.println("First Number is Largest.");
      }
      if(y>x && y>z)
      {
        System.out.println("Second Number is Largest.");
      }
      else if(z>x && z>y)
      {
        System.out.println("Third Number is Largest.");
      }
   }
}
class Test1
{
   public static void main(String args[])
   {
      Biggest b=new Biggest();
      b.condition();
      b.reverse();
   }
}
   

 