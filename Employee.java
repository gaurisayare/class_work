import java.util.Scanner;
class Employee
{
    String name;
    int id, days;
    Employee()
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter Name of Employee");
       name=s.next(); 
       System.out.println("Enter ID of Employee");
       id=s.nextInt();
       System.out.println("Enter number of days Employee presents");
       days=s.nextInt();
    }
    void salary()
    {
       System.out.println("Name"+name+"ID"+id);
       System.out.println("Employee salary= "+days*1000);
    }
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.salary();
    }
} 
