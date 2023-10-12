import java.util.Scanner;
class Library
{
  String name;
  int id, books;
  Library(String n,int i,int b)
  {   
    System.out.println("Student's name: "+n);
    System.out.println("Student's ID: "+i);
    System.out.println("Total no. of books taken by Student: "+b);         
  }
public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Student's Name: ");
    String name=s.next();
    System.out.println("Enter Student's ID: ");
    int id=s.nextInt();
    System.out.println("Enter number of books student took from library:  ");
    int books=s.nextInt();
    Library l = new Library(name,id,books);
   }
}