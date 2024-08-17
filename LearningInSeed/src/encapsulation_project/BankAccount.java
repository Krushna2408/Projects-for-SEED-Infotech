package encapsulation_project;

public class BankAccount 
{
	private String accountNumber;
	private double balance;
	//constructor to initialize the account number and balance
	public BankAccount(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance=balance;
	}
	//getter method to retrive the account number
	public  String getAccountNumber()
	{
		return accountNumber;
	}
	//setter method to set the account number 
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	//getter method to retrive the balance
	public double getBalance() {
		return balance;
	}
	//setter method to set the balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//method to deposit money into the account
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Deposit: $" + amount);
		}
		else 
		{
			System.out.println("Invaid amount for deposit");
		}
	}
	//method to withdraw money from the account
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdraw: $" + amount);
		}
		else 
		{
			System.out.println("Invalid amount for withdraw or insufficient balance");
		}
	}
    public static void main(String[] args) 
    {
		//creating a BankAccount object using encapsulation
    	BankAccount account = new BankAccount("CBIN0233423", 10000);
    	
    	//Accessing private variable through public method 
    	System.out.println("Account Number: " + account.getAccountNumber());
    	System.out.println("Balance: $" + account.getBalance());
    	
    	//Depositing and withdrawing money using public methods 
    	account.deposit(1000);
    	System.out.println("Balance after deposit: $" + account.getBalance());
    	
    	account.withdraw(200);
    	System.out.println("Balance after withdraw: $" + account.getBalance());
    	
	}
}
