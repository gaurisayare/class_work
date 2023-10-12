//WAJP to get car details from the user. 
//Here properties to display are brand, modelname, topspeed and write corresponding getters setters
//Atleast two car detailsshould be visible.
import java.util.Scanner;
class CustomerDetails
{
	private String cust_name;
	private String product_name;
	private int product_quantity;
	private int total_amt;
	
	//setters
	public void setcust_name(String cust_name)
	{	
		this.cust_name = cust_name;
	}
	
	public void setproduct_name(String product_name)
	{	
		this.product_name = product_name;
	}
	
	public void setproduct_quantity(int product_quantity)
	{	
		this.product_quantity = product_quantity;
	}
	
	public void settotal_amt(int total_amt)
	{	
		this.total_amt = total_amt;
	}

	//getters
	public String getcust_name()
	{
		return cust_name;
	}
	
	public String getproduct_name()
	{
		return product_name;
	}
	
	public int getproduct_quantity()
	{
		return product_quantity;
	}
	
	public int gettotal_amt()
	{
		return total_amt;
		
	}
}

	public class Customer
	{
	
		public static void main(String [] args)
		{
			CustomerDetails cd = new CustomerDetails();
			cd.setcust_name("Gauri");
			cd.setproduct_name("Coffee");
			cd.setproduct_quantity(5);
			cd.settotal_amt(100);
			
			System.out.println("Customer Name: " +cd.getcust_name());
			System.out.println("Product Name: " +cd.getproduct_name());
			System.out.println("Product Quantity: " +cd.getproduct_quantity());
			System.out.println("Total Amount: " +cd.gettotal_amt());
			
		}
	}
	
   