class StaticExample2	
{
    static int num;
    static String mystr;
    static
    {
      System.out.println("Static Block1");
      num=95;
      mystr="Block1";
    }
    static
    {
      System.out.println("Static Block2");
      num=99;
      mystr="Block2";
    }
    public static void main(String args[])
    {
     System.out.println("Value of num= "+num);
     System.out.println("Value of String= "+mystr);
    }
}