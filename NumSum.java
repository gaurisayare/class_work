import java.util.Scanner;
class Calculate
{
	int a, b, sum;
	public void inputdata()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		a = sc.nextInt();
		System.out.println("Enter second Number: ");
		b = sc.nextInt();
	}
	
	public void numsum()
	{ 
		sum = a + b;
	}
	
	public void outputdata()
	{ 
		System.out.println("Sum of the Numbers is : "+sum);
	}
	
	public static void main(String args[])
	{
	  Calculate obj = new Calculate();
	  obj.inputdata();
	  obj.numsum();
	  obj.outputdata();
	}
}