import java.io.*;
class InputStreamExample1
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fin1=new FileInputStream("D:\\testin.txt");
		FileInputStream fin2=new FileInputStream("D:\\testin1.txt");
		FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1)
		{
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success");
	}
}