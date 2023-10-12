class Example
{
String web;
Example(String w)
{
 web=w;
}
Example(Example je)
{
web=je.web;
}
void disp()
{
System.out.println("Website: "+web);
}
}
class Example1
{
public static void main(String args[])
{
Example e=new Example("Beginners Book");
Example e1=new Example(e);
e.disp();
e1.disp();
}
}