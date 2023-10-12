/* 
    1
	12
	123
	1234
	12345 
	1234
	123
	12
	1
*/ 

class Pattern5
{
	public static void main(String args[])
	{
		int i, j;                   //i is taken to iterate over row and j is for column
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);         //dont write println here because if u write it u will get output in a single coloum.
			}
		System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);         //dont write println here because if u write it u will get output in a single coloum.
			}
		System.out.println();
	    }
	}
}
