//Write a java program Student class with private fields:roll no,name, age,address.and public getter & setters

public class StudentGetSet 
{
    private int rollNo;
    private String name;
    private int age;
    private String address;

    // Getter and Setter methods for rollNo
    public int getRollNo() 
	{
        return rollNo;
    }

    public void setRollNo(int rollNo) 
	{
        this.rollNo = rollNo;
    }

    // Getter and Setter methods for name
    public String getName() 
	{
        return name;
    }

    public void setName(String name) 
	{
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() 
	{
        return age;
    }

    public void setAge(int age) 
	{
        this.age = age;
    }

    // Getter and Setter methods for address
    public String getAddress()
	{
        return address;
    }

    public void setAddress(String address)
	{
        this.address = address;
    }

    public static void main(String[] args) 
	{
        // Create a new Student object
        StudentGetSet student = new StudentGetSet();

        // Set values using setter methods
        student.setRollNo(8);
        student.setName("Gauri");
        student.setAge(22);
        student.setAddress("Kondhali");

        // Get values using getter methods
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
    }
}
