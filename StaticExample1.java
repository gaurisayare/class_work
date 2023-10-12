class StaticExample1
{
    static int num;
    static String mystr;
    static
    {
      num=95;
      mystr="Static Keyword";
    }
    public static void main(String args[])
    {
     System.out.println("Value of num= "+num);
     System.out.println("Value of String= "+mystr);
    }
}