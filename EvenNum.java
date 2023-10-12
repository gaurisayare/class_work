//wap to print all even numbers between 1 to 200
class EvenNum
{
   public static void main (String args[])
   {
   System.out.println("Even numbers between 1-200 : ");
   for(int i=1;i<=200;i++)
    {
     if(i%2==0)
	 {
	 System.out.print(i+", ");
	 }
	}
   }
}