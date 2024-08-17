package oops;

abstract class product 
{
	protected String productName;
	protected double price;
	
	public product(String productName, double price) 
	{
		this.productName = productName;
		this.price = price;
	}
	
	public abstract double calculateTotalPrice(int quantity);
	
	public void displayProductInfo() 
	{
		System.out.println("product: " + productName);
		System.out.println("price: $" + price);
	}
	
}
class GroceryProduct extends product 
{
	private double discount;
	
	public GroceryProduct(String productName, double price, double discount) 
	{
		super(productName, price);
		this.discount = discount;
	}
	
	//override
	public double calculateTotalPrice(int quantity) 
	{
		return price * quantity * (1- discount);
	}
}

class ElectronicsProduct extends product
{
	private int warrantyPeriod;
	
	public ElectronicsProduct(String productName, double price, int warrantyPeriod) 
	{
		super(productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	//override
	public double calculateTotalPrice(int quantity) {
		return price * quantity;
	}
	
	public static void main (String[] args) {
		GroceryProduct gp=new GroceryProduct("rice", 10, 0.1);
		ElectronicsProduct ep=new ElectronicsProduct("laptop", 800, 2);
		
		int quantity = 5;
		System.out.println("Grocery product information");
		gp.displayProductInfo();
		System.out.println("total price for"+"units : $" +gp.calculateTotalPrice(quantity));
		
		
		System.out.println("electronics product information: ");
		ep.displayProductInfo();
		System.out.println("total price for" + quantity + "units: $" + ep.calculateTotalPrice(quantity));
		
	}
	
}
	


