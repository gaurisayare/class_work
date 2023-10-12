class StaticExample4
{
    private static String str="Beginners Book";
    static class Myclass 
    {
       public void display()
       { 
          System.out.println("String: "+str);
        }
     }
     public static void main(String args[])
     {
        StaticExample4.Myclass s = new StaticExample4.Myclass();
        s.display();
      }
}
 
 