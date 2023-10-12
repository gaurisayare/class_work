class ConstructorVariable
{
    private int var;
    //dafault constructor
    public ConstructorVariable()
    {
       this.var = 10;
    }
    //parameterized constructor
    public ConstructorVariable(int num)
    {
       this.var=num;
    }
    public int getValue()
    {
       return var;
    }
    public static void main(String args[])
    {
        ConstructorVariable obj = new ConstructorVariable();
         ConstructorVariable obj2 = new ConstructorVariable(100);
        System.out.println("var is: "+obj.getValue());
        System.out.println("var is: "+obj2.getValue());
}
}aza
   

 
