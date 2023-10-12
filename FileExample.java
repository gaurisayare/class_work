import java.io.FileOutputStream;
public class FileExample
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("D:\\File1.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}