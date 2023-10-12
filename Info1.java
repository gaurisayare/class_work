
import java.util.Scanner;
class Info1
{
	String name;
	String address;
	int age;
	
	void tellName(){};
	void tellAddress(){};
	void tellAge(){};
	public static void main(String args[])
	{
		Info1 obj = new Info1();
		obj.name = "George";              //using dot operator u can assign values
		obj.address = "Los Angels";
		obj.age = 23;
		System.out.println("Name: "+obj.name); 
		System.out.println("Address: "+obj.address);
		System.out.println("Age: "+obj.age);
	}
}