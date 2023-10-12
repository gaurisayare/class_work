class Bike2
{
  final int speedlimit;
  Bike2()
  {
    speedlimit=90;//we r able to pass value in Constructor only if u finalised any variable without value.
    System.out.println("Speedlimit");
  }
  public static void main(String args[])
  {
    Bike2 b=new Bike2();
  }
}
