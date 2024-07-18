package ThreadLab.com;

public class BankApp
{
    private double balance;

    public BankApp(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {  
        try 
        {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
            System.out.println("Current balance after deposit: " + balance);
        } 
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }

    public void withdraw(double amount)
    {
        try
        {
            if (balance >= amount)
            {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
                System.out.println("Current balance after withdrawal: " + balance);
            } 
            else 
            {
                System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount + " but insufficient funds!");
            }
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
    }

public class BankApp
{
	public static void main(String[] args)
	{
		BankAccount account = new BankAppp(1000);

        // Creating multiple threads for concurrent deposits and withdrawals
        Thread depositThread = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                account.deposit(200);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(300);
            }
        });

        // Starting the threads
        depositThread.start();
        withdrawThread.start();

	}

}
