/*Write a Java programming to create a e-commerce system with three classes product customer and order, online product and physical 
product are implementation of Product interface. procuct intrface has list of product as method for adding them. Product should be
the iterface with methods show product, addproduct, delete product, and claculate product prize*/

package EncapsulationAbstraction;
//import scanner class to take input from user
import java.util.Scanner;
//Create the interface of product
interface Product 
{
	//Create the abstract method for showProduct,AddProduct,DeleteProduct and calculate price
    void showProduct();
    void addProduct(String name, double price);
    void deleteProduct(String name);
    double calculateProductPrice();
}
//Create the OnlineProduct class which implement the interface
class OnlineProduct implements Product 
{
	// Create the private variable array of product and Prices
    private String[] products;
    private double[] prices;
    private int size;
    //Creating the constructor
    public OnlineProduct(int capacity)
    {
        products = new String[capacity];
        prices = new double[capacity];
        size = 0;
    }
    //override the abstract method
    @Override
    public void showProduct() 
    {
        System.out.println("Online Products:");
        for (int i = 0; i < size; i++)
        {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i]);
        }
    }

 // Method to add product
    @Override
    public void addProduct(String name, double price)
    {
        products[size] = name;
        prices[size] = price;
        size++;
    }

 // Method to delete product
    @Override
    public void deleteProduct(String name)
    {
        int index = -1;
        for (int i = 0; i < size; i++) 
        {
            if (products[i].equals(name)) 
            {
                index = i;
                break;
            }
        }
        if (index != -1) 
        {
            for (int i = index; i < size - 1; i++) 
            {
                products[i] = products[i + 1];
                prices[i] = prices[i + 1];
            }
            size--;
            System.out.println("Product '" + name + "' deleted successfully.");
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }
 // Method to calculate total price of products
    @Override
    public double calculateProductPrice() 
    {
        double totalPrice = 0;
        for (int i = 0; i < size; i++)
        {
            totalPrice += prices[i];
        }
        return totalPrice;
    }
}
//PhysicalProduct class implementing Product interface
class PhysicalProduct implements Product
{
    private String[] products;
    private double[] prices;
    private int size;
 // Constructor to initialize products and prices arrays
    public PhysicalProduct(int capacity)
    {
        products = new String[capacity];
        prices = new double[capacity];
        size = 0;
    }

 // Method to show products
    @Override
    public void showProduct()
    {
        System.out.println("Physical Products:");
        for (int i = 0; i < size; i++) 
        {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i]);
        }
    }

    @Override
    public void addProduct(String name, double price)
    {
        products[size] = name;
        prices[size] = price;
        size++;
    }

    @Override
    public void deleteProduct(String name) 
    {
        int index = -1;
        for (int i = 0; i < size; i++)
        {
            if (products[i].equals(name)) 
            {
                index = i;
                break;
            }
        }
        if (index != -1)
        {
            for (int i = index; i < size - 1; i++) 
            {
                products[i] = products[i + 1];
                prices[i] = prices[i + 1];
            }
            size--;
            System.out.println("Product '" + name + "' deleted successfully.");
        } 
        else
        {
            System.out.println("Product not found.");
        }
    }

    @Override
    public double calculateProductPrice() 
    {
        double totalPrice = 0;
        for (int i = 0; i < size; i++)
        {
            totalPrice += prices[i];
        }
        return totalPrice;
    }
}
//Customer class
class Customer
{
    private String name;
    private String email;
 // Constructor to initialize name and email
    public Customer(String name, String email) 
    {
        this.name = name;
        this.email = email;
    }

    public String getName() 
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }
}

class Order 
{
    private Customer customer;
    private Product product;
 // Constructor to initialize customer and product
    public Order(Customer customer, Product product) 
    {
        this.customer = customer;
        this.product = product;
    }
 // Method to display order details
    public void displayOrderDetails() 
    {
        System.out.println("Order Details:");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        product.showProduct();
        System.out.println("Total Price: " + product.calculateProductPrice());
    }
}

public class EcommerceApp 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		 // Get the maximum number of online products
        System.out.print("Enter the maximum number of online products: ");
        int maxOnlineProducts = scanner.nextInt();
        scanner.nextLine(); 

        OnlineProduct onlineProduct = new OnlineProduct(maxOnlineProducts);
     // Get the maximum number of physical products
        System.out.print("Enter the maximum number of physical products: ");
        int maxPhysicalProducts = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PhysicalProduct physicalProduct = new PhysicalProduct(maxPhysicalProducts);

        Customer customer = new Customer("kalpesh", "kalpesh@12.com");
     // Add products to online and physical product lists
        addProducts(scanner, onlineProduct, "Online");
        addProducts(scanner, physicalProduct, "Physical");
        // Display order details for online and physical products
        System.out.println("=== Order Details ===");
        Order onlineOrder = new Order(customer, onlineProduct);
        onlineOrder.displayOrderDetails();

        Order physicalOrder = new Order(customer, physicalProduct);
        physicalOrder.displayOrderDetails();

        scanner.close();
    }
	 // Helper method to add products to a product list
    private static void addProducts(Scanner scanner, Product product, String productType)
    {
        System.out.println("Adding " + productType + " Products:");
        while (true) 
        {
            System.out.print("Enter product name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done"))
            {
                break;
            }
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            product.addProduct(name, price);
        }
	}

}

/*
  Dry Run Test
  
   Maximum number of online products: 3
   Maximum number of physical products: 3
   Online products:
       Product 1: Laptop, Price: 1000
       Product 2: Phone, Price: 500
       Product 3: Headphones, Price: 100
   Physical products:
       Product 1: Chair, Price: 150
       Product 2: Table, Price: 200
       Product 3: Lamp, Price: 50
 */