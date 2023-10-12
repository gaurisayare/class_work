import java.io.*;
public class BufferedOutputStreamExample
{
	public static void main(String args[])
	{
		FileOutputStream fout=new FileOutputStream("D:\\Test1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="WELCOME";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
	}
}