import java.util.StringTokenizer;
public class SimpleStringTokenizer3
{
	public static void main(String args[])
	{
		/*StringTokenizer object*/
		StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");
		
		/*Print the number of tokens present in the String*/
		System.out.println("Total numbers of tokens: "+st.countTokens());
	}
}