import java.io.*;
public class FileExample3
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream fis=new FileInputStream("D:\\testout.txt");
		do
		{
		  i=fis.read();
		  if(i!=-1)
		  System.out.println((char)i);
		}
		while(i!=-1);
		fis.close();
	}
}