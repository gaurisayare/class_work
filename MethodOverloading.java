public class MethodOverloading
{
	int add(int num1, int num2)
	{
		return num1+num2;
	}
	double add(int num1, double num2, int num3)
	{
		return num1+num2+num3;
	}
	int add(int num1, int num2, int num3, int num4)
	{
		return num1+num2+num3+num4;
	}
	public static void main(String args[])
	{
		MethodOverloading obj = new MethodOverloading();
		//This will call the first add method
		System.out.println("Sum of two numbers: "+obj.add(10,20));
		//This will call the second add method
		System.out.println("Sum of two numbers: "+obj.add(10,5.5,20));
		//This will call the third add method
		System.out.println("Sum of two numbers: "+obj.add(10,20,30,40));
	}
}