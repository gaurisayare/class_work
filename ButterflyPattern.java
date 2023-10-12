/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

class ButterflyPattern
{
	public static void main(String args[])
	{
		int i, j, k, l;                   //i is taken to iterate over row and j is for column
		
		//for upper part
		for(i=1;i<=5;i++)
		{
			//for first star
			for(j=1;j<=i;j++)        
			{
				System.out.print("*");         
			}
		    
			//for spacing
			for(k=i*2;k<=9;k++)
			{
				System.out.print(" ");         
			}
			
			//for last star
            for(l=1;l<=i;l++)
			{
				System.out.print("*");         
			}
			System.out.println();
		}
		
		//for lower part
		for(i=1;i<=4;i++)
		{
			//for first star
			for(j=4;j>=i;j--)
			{
				System.out.print("*");         
			}
		    
			//for spacing
			for(k=1;k<=i*2;k++)
			{
				System.out.print(" ");         
			}
			
			//for last star
            for(l=4;l>=i;l--)
			{
				System.out.print("*");        
			}
			System.out.println();
		}
	}
}