class StaticExample3
{
   static int i=2;
   static String s="BeginnersBook";
   static void display()
   {
      System.out.println("i:"+i);
      System.out.println("s:"+s);
   }
   void func()
   {
      display();
   }
   public static void main(String args[])
   {
      StaticExample3 e= new StaticExample3();
      e.func();
      display();
   }
}
   
