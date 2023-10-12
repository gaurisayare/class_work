//Fibonacci Series in java
class Fibonacci
{
   public static void main(String args[])
   {
   int firstnum = 0, secondnum = 1;
   System.out.println("Fibonacci Series: ");
   for(int i=1;i<=10;i++)
		{
			System.out.print(firstnum+" ");
		    int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}
	}
}	