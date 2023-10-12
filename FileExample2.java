import java.io.FileOutputStream;
public class FileExample2
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
			String s="Welcome To Our Java Program";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}