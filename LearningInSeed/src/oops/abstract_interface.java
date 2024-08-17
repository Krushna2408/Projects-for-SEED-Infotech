package oops;

interface BankAccount
{
	void deposit(double amount);
	
	void withdraw(double amount);
	
	double checkBalance();
}

class SavingAccount implements BankAccount
{
	private double balance;
	
	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println("deposited: $" + amount);
	}
	
	public void withdraw (double amount) 
	{
		if (balance >= amount)
		{
			balance -= amount;
			System.out.println("Withdraw: $" + amount);
		}
		else
		{
			System.out.println("insufficient funds!");
		}
	}
	
	public double checkBalance()
	{
		return balance;
	}
}
class CurrentAccount implements BankAccount
{
	private double balance;
	
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}
	
	public void withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		}
		else
		{
			System.out.println("Insufficient funds!");
		}
	}
	
	public double checkBalance()
	{
		return balance;
	}
}

public class abstract_interface {

	public static void main(String[] args) 
	{
		BankAccount savingAccount = new SavingAccount();
		BankAccount CurrentAccount = new CurrentAccount();
		
		savingAccount.deposit(1000);
		System.out.println("Saving Account Balance: $" + savingAccount.checkBalance());
		savingAccount.withdraw(500);
		System.out.println("Saving Account Balance: $" + savingAccount.checkBalance());
		
		CurrentAccount.deposit(2000);
		System.out.println("Current Account Balance: $" + CurrentAccount.checkBalance());
		CurrentAccount.withdraw(2500);
	}

}
