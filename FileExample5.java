import java.io.*;
public class FileExample5
{
	public static void main(String args[]) throws Exception
	{

		FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="Welcome To Our Java Program";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Success");
		
	}
}