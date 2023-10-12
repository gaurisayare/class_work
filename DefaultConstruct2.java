//Parameterized Constructor
class Pet
{
	int age;
	String name;
	public Pet(String name)
	{
		this.name = name;
	}
}

class ParameterConstruct1
{
	public static void main(String args[])
	{
		Pet obj = new Pet("Puppy");
		System.out.println(obj.name);
	}
}

