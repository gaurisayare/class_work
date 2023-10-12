import java.io.*;
public class FileExample4
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileOutputStream fout=new FileOutputStream("D:\\Test.txt");
		String s="TATA";
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		fout.write(ch[i]);
		fout.close();
	}
}