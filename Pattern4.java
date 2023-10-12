/* 
    1
	22
	333
	4444
	55555 
*/ 

class Pattern4
{
	public static void main(String args[])
	{
		int i, j;                   //i is taken to iterate over row and j is for column
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);         //dont write println here because if u write it u will get output in a single coloum.
			}
		System.out.println();
	    }
	}
}