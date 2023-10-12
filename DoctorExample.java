class Doctor
{
	String name;
	
	public Doctor(String name)
	{
		this.name = name;
	}
	
	public void diagnose()
	{
		System.out.println(name+" is a diagnosing.");
	}
}
 
 
class Surgeon extends Doctor
{
	public Surgeon(String name)
	{
		super(name);
	}
	public void performSurgery()
	{
		System.out.println(name+" is performing Surgery.");
	}
}

class Nurse extends Doctor
{
	public Nurse(String name)
	{
		super(name);
	}
	public void assistDoctor()
	{
		System.out.println(name+" is assisting the doctor.");
	}
}

public class DoctorExample
{
	public static void main(String args[])
	{
	Doctor d = new Doctor("Dr. Gauri");
	Surgeon s = new Surgeon("Dr. Unnati");
	Nurse n = new Nurse("Nurse Harsha");
	d.diagnose();
	//s.diagnose();
	s.performSurgery();
	//n.diagnose();
	n.assistDoctor();
    }
}