import java.util.StringTokenizer;
public class SimpleStringTokenizer1
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer("I am proud to be an Indian"," ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
    }
}