
package q2Inharetance;


public class Customer {

	private String customerName;
	private int creditPoints;
	
	Customer(String customerName,int creditPoints)
	{
		this.customerName=customerName;
		this.creditPoints=creditPoints;
	}
	
	public int getCreditPoints()
	{
		return creditPoints;
	}
	
	public String toString()
	{
		return customerName;
	}
}
	
