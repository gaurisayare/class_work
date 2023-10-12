/*
	5
	54
	543
	5432
	54321
*/


class Pattern7
{
	public static void main(String args[])
	{
		int i, j;                   //i is taken to iterate over row and j is for column
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);         //dont write println here
			}
		System.out.println();
	    }
	}
}