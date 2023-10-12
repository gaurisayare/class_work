import java.util.*;

public class SimpleStringTokenizer2
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("my,name,is,Sam");

		//printing next token
		System.out.println("Next token is : "+st.nextToken(","));
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}