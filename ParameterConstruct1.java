//Parameterized Constructor
class Pet
{
	int age;
	String name;
	public Pet(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}

class ParameterConstruct1
{
	public static void main(String args[])
	{
		Pet obj = new Pet("Puppy",15);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
}

