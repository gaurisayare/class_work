//Create a class Person with two private data members name and age perform encapsulation all these fields.

class Person1
{
	//private variable
	private String name;
	private int age;
	
    //setter method
	public void setName(String name)
	{
		this.name = name;
	}
	
	//getter method
	public String getName()
	{
		return this.name;
	}
	
	//setter method
	public void setAge(int age)
	{
		this.age = age;
	}
	
    //getter method
	public int getAge()
	{
		return this.age;
	}

}

public class Private1
{
	public static void main(String[] main)
	{
		//create an object of Person
		Person1 d = new Person1();
		
		//access private variable using getter and setter method
		d.setName("Gauri");
		d.setAge(21);
		System.out.println(d.getName());
		System.out.println(d.getAge());
	}
}