//User input as a string
import java.util.Scanner;
class StringDemo
{
	public static void main(String args[])
	{
		String str1, str2="Hello";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		str1 = sc.nextLine();
		System.out.println("WELCOME "+str1);
		System.out.println(str2);
		
		if(str1.equals(str2)) //string comparison is not happen by using == it is happen like this..
		{
			System.out.println("Both the Strings are equal.... ");
		}
	}
}