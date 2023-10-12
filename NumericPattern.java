/*  1
	23
	456
	78910
	1112131415
	161718192021
*/
class NumericPattern
{
	public static void main(String args[])
	{
		int i, j, k=1;                   //i is taken to iterate over row and j is for column
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k++);         
			}
		System.out.println();
	    }
	}
}