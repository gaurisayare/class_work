class A
{
  public void methodA()
  {
     System.out.println("Method of class A");
  }
}
class B extends A
{
  public void methodB()
  {
     System.out.println("Method of class B");
  }
}
class C extends A
{
  public void methodC()
  {
     System.out.println("Method of class C");
  }
}  
class D extends A
{
  public void methodD()
  {
     System.out.println("Method of class D");
  }
}       
class TestInheritance4
{
  public static void main(String args[])
  {
  B obj1=new B();
  C obj2=new C();
  D obj3=new D();
  obj1.methodA();
  obj2.methodA();
  obj3.methodA();
  }
}