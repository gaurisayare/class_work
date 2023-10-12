public class Employee1
{
int empId;
String empName;
Employee1(int id , String name)
{
this.empId = id;
this.empName = name;
}
void info()
{
System.out.println("Id: "+empId+"Name: "+empName);
}
public static void main (String srgs[])
{
Employee1 obj1=new Employee1(12,"Gauri");
Employee1 obj2=new Employee1(14,"Sayare");
obj1.info();
obj2.info();
}
}
