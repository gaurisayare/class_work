class Basic
{
public static void prt(String s)
{
System.out.println(s);
}
public static void prt()
{
System.out.println();
}
public static void main (String args[])
{
int a=100, b=20;
double x=10.23, y=11.65;
System.out.println("Basic");
prt();
prt("Java Language");
prt(String.valueOf(a));
prt(""+a);
prt();
prt("Pi Constant:"+Math.PI);
prt("E Constant:"+Math.E);
prt();
prt("Max:"+Math.max(a,b));
prt("Min:"+Math.min(a,b));
prt();
prt("Sine:"+Math.sin(45*Math.PI/180));
prt("Cosine:"+Math.cos(45*Math.PI/180));
prt();
prt("Floor:"+Math.floor(x));
prt("Floor:"+Math.floor(y));
prt("Ceil:"+Math.ceil(x));
prt("Ceil:"+Math.ceil(y));
prt("Round:"+Math.round(x));
prt("Round:"+Math.round(x));
int i;
for(i=1;i<=10;i++)
{
prt("Random:"+(Math.random()*1000));
}
for(i=1;i<=10;i++)
{
prt("Sqrt:"+Math.sqrt(i));
}
prt("Power:"+Math.pow(10,2));
}
}