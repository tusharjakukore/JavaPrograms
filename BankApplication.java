
/*Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses:
	SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and
	withdrawals for each account type.*/

package EncapsulationAbstraction;

import java.util.Scanner;
//Abstract class BankAccount
abstract class BankAccount1
{
	private String accountNo;
	private double balance;
	// Constructor to initialize account number and balance
	public BankAccount1(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Abstract methods for deposit and withdraw
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
//SavingAccount1 class extending BankAccount
class SavingAccount1 extends BankAccount1
{
	// Constructor to initialize account number and balance
	public SavingAccount1(String accountNo, double balance) {
		super(accountNo, balance);
	}
	// Method to deposit amount
	@Override
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Deposite of "+amount+ "successful. Current balance is "+getBalance());
	}
	// Method to withdraw amount
	@Override
	void withdraw(double amount) {
			if(getBalance()>=amount)
			{
				setBalance(getBalance()-amount);
				System.out.println("withdraw of "+amount+ "successful. Current balance is "+getBalance());
			}
			else
			{
				System.out.println("withdraw fail. Insufficient funds");
			}
	}
}
//CurrentAccount class extending BankAccount
class CurrentAccount extends BankAccount1
{
	public CurrentAccount(String accountNo, double balance) {
		super(accountNo, balance);
	}
	@Override
	void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Deposite of "+amount+ "successful. Current balance is "+getBalance());
	}
	@Override
	void withdraw(double amount) {
		if(getBalance()>=amount)
		{
			setBalance(getBalance()-amount);
			System.out.println("withdraw of "+amount+ "successful. Current balance is "+getBalance());
		}
		else
		{
			System.out.println("withdraw fail. Insufficient funds");
		}
	}
}

public class BankApplication 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        // Create SavingAccount
        System.out.println("Enter Saving Account Holder Name:");
        String savingAccountHolderName = scanner.nextLine();
        System.out.println("Enter Saving Account Initial Balance:");
        double savingAccountInitialBalance = scanner.nextDouble();
        SavingAccount1 sa = new SavingAccount1(savingAccountHolderName, savingAccountInitialBalance);

        // Create CurrentAccount
        System.out.println("Enter Current Account Holder Name:");
        scanner.nextLine(); // Consume newline character
        String currentAccountHolderName = scanner.nextLine();
        System.out.println("Enter Current Account Initial Balance:");
        double currentAccountInitialBalance = scanner.nextDouble();
        CurrentAccount ca = new CurrentAccount(currentAccountHolderName, currentAccountInitialBalance);

        // Perform transactions
        System.out.println("\nSaving Account Transactions:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Choose a transaction (1/2): ");
        int savingTransactionChoice = scanner.nextInt();
        switch (savingTransactionChoice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double savingDepositAmount = scanner.nextDouble();
                sa.deposit(savingDepositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double savingWithdrawAmount = scanner.nextDouble();
                sa.withdraw(savingWithdrawAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("Savings Account Balance: " + sa.getBalance());

        System.out.println("\nCurrent Account Transactions:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Choose a transaction (1/2): ");
        int currentTransactionChoice = scanner.nextInt();
        switch (currentTransactionChoice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double currentDepositAmount = scanner.nextDouble();
                ca.deposit(currentDepositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double currentWithdrawAmount = scanner.nextDouble();
                ca.withdraw(currentWithdrawAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("Current Account Balance: " + ca.getBalance());

	}

}


/*
   Dry Run Test
   Saving account holder name: kalpesh
   Saving account initial balance: 5000
   Current account holder name: padma
   Current account initial balance: 3000
   Saving account transaction: Deposit 1000
   Current account transaction: Withdraw 500
   
   Saving Account Transactions:
   1. Deposit
   2. Withdraw
   Choose a transaction (1/2): 1
   Enter amount to deposit: 1000
   Deposit of 1000.0 successful. Current balance is 6000.0
   Savings Account Balance: 6000.0

   Current Account Transactions:
   1. Deposit
   2. Withdraw
   Choose a transaction (1/2): 2
   Enter amount to withdraw: 500
   Withdraw of 500.0 successful. Current balance is 2500.0
   Current Account Balance: 2500.0  
 */