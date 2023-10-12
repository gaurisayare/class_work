import org.shape.Square;
import org.shape.Circle;
import org.shape.Triangle;
import java.util.*;
class TestPackage
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the side of the Square: ");
    int s=sc.nextInt();
    Square sq=new Square(s);
    System.out.println("Perimeter of the Square is: "+sq.perimeter());
    System.out.println("Area of Square: "+sq.area());
    
    System.out.println("Enter the radius of the Circle: ");
    int r=sc.nextInt();
    Circle ci=new Circle(s);
    System.out.println("Perimeter of the Circle is: "+ci.perimeter());
    System.out.println("Area of Circle: "+ci.area());
 
    System.out.println("Enter the Side1,Side2,Side3 of the Triangle: ");
    int s1=sc.nextInt();
    //System.out.println("Enter the Side2 of the Triangle: ");
    int s2=sc.nextInt();
    //System.out.println("Enter the Side3 of the Triangle: ");
    int s3=sc.nextInt();
    Triangle t=new Triangle(s1,s2,s3);
    System.out.println("Perimeter of the Triangle is: "+t.perimeter());
    System.out.println("Area of Triangle: "+t.area());
  }
}   