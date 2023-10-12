import java.io.*;
import java.util.*;
class InputStreamExample2
{
	public static void main(String args[]) throws IOException
	{
		//creating the FileInputStream objects for all the files
		FileInputStream fin=new FileInputStream("D:\\a.txt");
		FileInputStream fin2=new FileInputStream("D:\\b.txt");
		FileInputStream fin3=new FileInputStream("D:\\c.txt");
		FileInputStream fin4=new FileInputStream("D:\\d.txt");
		
		//creating Vector object to all the stream
		Vector v=new Vector();
		v.add(fin);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		
		//Creating Enumeration object by calling the elements method
		Enumeration e=v.elements();
		//passing the enumeration object in the constructor
		SequenceInputStream bin=new SequenceInputStream(e);
		int i=0;
		while((i=bin.read())!=-1)
		{
			System.out.println((char)i);
		}
		bin.close();
		fin.close();
		fin2.close();
		fin3.close();
		fin4.close();
		
	}
}