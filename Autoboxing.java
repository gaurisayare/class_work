class Autoboxing
{
	public static void main(String args[])
	{
		int x = 25, y;
		Integer val = new Integer(x);  //Autoboxing
		y = val;  //Unboxing
		System.out.println("Value after autoboxing\t"+val);
		System.out.println("Value after Unboxing\t"+y);
	}
}