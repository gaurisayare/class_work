/*
*****
*   *
*   *
*   *
*****

*/


class HollowRectanglePattern
{

	public static void main(String args[])
	{
		int i, j;                 //i is taken to iterate over row and j is for column
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
		       if(i==1 || i==5 || j==1 || j==5)     //always the inner for condition is used to print.
			   {
				System.out.print("*");
			   }
			   else
			   {
				System.out.print(" ");
			   }
			}
		System.out.println();
	    }
	}
}