class Bike1
{
   final void run()
   {
     System.out.println("Running");
   }
}
class Honda extends Bike1
{
  void run()//It gives error because it was finalised above i.e.final void run() so we r not able to make a function again.
  {
    System.out.println("Running Safely");
  }
  public static void main(String args[])
  {
    Honda h=new Honda();
    h.run();
  }
}

