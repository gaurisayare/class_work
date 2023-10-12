//Understanding static and non static methods.

class StaticDemo
{
	int res;
	public void add(int a, int b)    //nonstatic methods
	{
		res = a+b;
		System.out.println("The addition is: "+res);   // we are nt using any return type here so we have to print the value
	}
	
	static int multiply(int a,int b)n  //static method 
	{
		return a*b;
	}
	
	double div(int a, int b)
	{
		return (a/b);
	}
}
public class StaticTest
{
	public static void main(String args[])
	{
		StaticDemo obj = new StaticDemo();
		obj.add(3,8);
		//If method is tatic you jhave to call it by class name
		System.out.println("The multi[lication is: "+StaticDemo.multiply(6,5));   
		//here we didnt use static method so thats why here we call the method by using object
		System.out.println("The division is: "+obj.div(49,7));    
	}
}