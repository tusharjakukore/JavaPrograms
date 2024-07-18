/*Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount
and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.*/

package Lab4.kk.org;
import java.util.*;
//Base class for Bank Account
class BankAccount
{
    protected double balance;
 // Constructor to initialize the initial balance
    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }
 // Method to deposit money into the account
    public void deposit(double amount)
    {
        balance =balance+ amount;
        System.out.println("Deposited: " + amount+"INR");
        System.out.println("Current Balance: " + balance+"INR");
        
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn:" + amount+"INR");
            System.out.println("Current Balance:" + balance+"INR");
        } 
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
}
//SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount 
{
    private double withdrawalLimit;
 // Constructor to initialize initial balance and withdrawal limit
    public SavingsAccount(double initialBalance, double withdrawalLimit) 
    {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount)
    {
        if (amount <= withdrawalLimit && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn:" + amount+"INR");
            System.out.println("Current Balance:" + balance+"INR");
        } 
        else 
        {
            System.out.println("Withdrawal limit exceeded or insufficient balance!");
        }
    }
}
//CheckingAccount class extending BankAccount
class CheckingAccount extends BankAccount 
{
    private double overdraftFee;

    public CheckingAccount(double initialBalance, double overdraftFee) 
    {
        super(initialBalance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+"INR");
            System.out.println("Current Balance: " + balance+"INR");
        } 
        else 
        {
            balance -= overdraftFee;
            System.out.println("Withdrawn with overdraft fee:" + (amount + overdraftFee) +"INR");
            System.out.println("Current Balance:" + balance+"INR");
        }
    }
}

public class BankAccountApp 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);
		// Input for savings account
        System.out.println("Enter initial balance:");
        double savingsInitialBalance = xyz.nextDouble();
        System.out.println("Enter withdrawal limit:");
        double savingsWithdrawalLimit = xyz.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsInitialBalance, savingsWithdrawalLimit);
        // Input for checking account
        System.out.println("Creating Checking Account...");
        System.out.println("Enter initial balance:");
        double checkingInitialBalance = xyz.nextDouble();
        System.out.println("Enter overdraft fee:");
        double checkingOverdraftFee = xyz.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkingInitialBalance, checkingOverdraftFee);

        System.out.println("Enter deposit amount for Savings Account:");
        double depositAmountSavings = xyz.nextDouble();
        savingsAccount.deposit(depositAmountSavings);

        System.out.println("Enter withdrawal amount for Savings Account:");
        double withdrawAmountSavings = xyz.nextDouble();
        savingsAccount.withdraw(withdrawAmountSavings);

        System.out.println("Enter deposit amount for Checking Account:");
        double depositAmountChecking = xyz.nextDouble();
        checkingAccount.deposit(depositAmountChecking);

        System.out.println("Enter withdrawal amount for Checking Account:");
        double withdrawAmountChecking = xyz.nextDouble();
        checkingAccount.withdraw(withdrawAmountChecking);

	}
}

/*
 * dry run test
 * Enter initial balance for Savings Account: 5000
   Enter withdrawal limit for Savings Account: 1000
   Creating Checking Account...
   Enter initial balance for Checking Account: 3000
   Enter overdraft fee for Checking Account: 50
   Enter deposit amount for Savings Account: 2000
   Deposited: 2000.0 INR 
   Current Balance: 7000.0 INR
   Enter withdrawal amount for Savings Account: 1500
   Withdrawn: 1500.0 INR
   Current Balance: 5500.0 INR
   Enter deposit amount for Checking Account: 1000
   Deposited: 1000.0 INR
   Current Balance: 4000.0 INR
   Enter withdrawal amount for Checking Account: 5000
   Withdrawn with overdraft fee: 5050.0 INR
   Current Balance: -1050.0 INR
 */