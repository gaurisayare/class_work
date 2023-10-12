import java.util.Scanner;
class ScannerTest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your roll No");
int rollno = sc.nextInt();
System.out.println("Enter your name");
String name = sc.next();
System.out.println("Enter your fee");
double fee = sc.nextDouble();
System.out.println("Roll no:"+rollno+"name:"+name+"Fee:"+fee);
sc.close();
}
}