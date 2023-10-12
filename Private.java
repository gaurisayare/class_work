//Private access modifier

class Person
{
	//private variable
	private String name;
	
	//getter method
	public String getName()
	{
		return this.name;
	}

    //setter method
	public void setName(String name)
	{
		this.name = name;
	}
}

public class Private
{
	public static void main(String[] main)
	{
		//create an object of Person
		Person d = new Person();
		
		//access private variable using getter and setter method
		d.setName("Gauri");
		System.out.println(d.getName());
	}
}

/* If u are going to access data which is private it will give u this error

Private.java:16: error: name has private access in Person
                d.name = "Gauri";
                 ^
1 error
*/