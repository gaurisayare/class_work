import java.util.Scanner;
class Student
{
  String name;
  int rollno;
  public void details()
  {
    Scanner s = new Scanner (System.in);
    System.out.println("Enter Name of Student: ");
    name=s.next();
    System.out.println("Enter Roll no. of Student: ");
    rollno=s.nextInt();
  }
  void print()
  {
    System.out.println("Name : "+name);
    System.out.println("Roll no. : "+rollno);
  }
}

class Marks extends Student
{
   int m1,m2,m3,total;
   float percent; 
   public void marksinfo()
   {
     Scanner s = new Scanner (System.in);
     System.out.println(" Enter marks of 3 subjects: ");
     m1=s.nextInt();
     m2=s.nextInt();
     m3=s.nextInt();
     total=m1+m2+m3;
     System.out.println("Total:"+total);
     percent=total/3;
     System.out.println("Percent: "+percent);
     if(percent>=90)
     {
       System.out.println("Grade A");
     }
     else if(percent>=75 && percent<90)
     {
       System.out.println("Grade B");
     }
     else if(percent>=65 && percent<75)
     {
       System.out.println("Grade C");
     }
     else if(percent>=50 && percent<65)
     {
       System.out.println("Grade D");
     }
     else

     {
        System.out.println("Fail");
     }

    }
 }
class PrintStudentData
{
   public static void main(String args[])
   {
      Marks obj= new Marks();
      obj.details();
      obj.print();
      obj.marksinfo();
    }
}




















