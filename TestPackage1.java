import shop.etrx.Bardi;
import shop.etrx.Mahal;
import shop.etrx.Sadar;
import java.util.*;
class TestPackage1
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the quantity of TV, Laptop & AC sold at Bardi: ");
    int tv1=sc.nextInt();
    int lapy1=sc.nextInt();
    int ac1=sc.nextInt();
    Bardi b=new Bardi(tv1,lapy1,ac1);
    System.out.println("Total Income at Bardi: "+b.ba_income());
	
	System.out.println("Enter the quantity of TV, Laptop & AC sold at Mahal: ");
    int tv2=sc.nextInt();
    int lapy2=sc.nextInt();
    int ac2=sc.nextInt();
    Mahal m=new Mahal(tv2,lapy2,ac2);
    System.out.println("Total Income at Mahal: "+m.ma_income());
	
	System.out.println("Enter the quantity of TV, Laptop & AC sold at Sadar");
    int tv3=sc.nextInt();
    int lapy3=sc.nextInt();
    int ac3=sc.nextInt();
    Sadar s=new Sadar(tv3,lapy3,ac3);
    System.out.println("Total Income at Sadar: "+s.sa_income());
	
	double to_income=b.ba_income()+m.ma_income()+s.sa_income();
	System.out.println("Total Income at Electronics Shop: "+to_income);
  }
}   