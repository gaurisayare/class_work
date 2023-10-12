import java.util.Scanner;
class Hospital
{
    String name;
    int p_id,s_id,days;
    void Hosp_details()
    {
       System.out.println("\t\t !!!! GS Hospital !!!!");
       System.out.println("\t\t Dt:-10/08/2001");
    }
}
class Patient extends Hospital
{
   void Patient_Details()
   {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter Patient's Name & Id: ");
   name=s.nextLine();
   p_id=s.nextInt();
   System.out.println("Enter the number of days patient admitted in hospital");
   days=s.nextInt();
   }
   void Billing()
   {
     System.out.println("Patient's Name: "+name+"\tPatient's Id: "+p_id);
     System.out.println("Total Billing: "+days*1000);
   }
}
class Staff extends Hospital
{
   void Staff_Details()
   {
   Scanner s1=new Scanner(System.in);
   System.out.println("Enter Staff Name & Id: ");
   name=s1.nextLine();
   s_id=s1.nextInt();
   System.out.println("Enter the number of days staff services in hospital");
   days=s1.nextInt();
   }
   void Salary()
   {
     System.out.println("Staff Name: "+name+"\tStaff Id: "+s_id);
     System.out.println("Total Salary: "+days*1000);
   }
}
class Management
{
    public static void main (String args[])
    {
    Patient p=new Patient();
    Staff st=new Staff();
    p.Hosp_details();
    p.Patient_Details();
    p.Billing();
    st.Staff_Details();
    st.Salary();
    }
}
   
  
