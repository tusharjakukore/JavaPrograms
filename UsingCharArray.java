//Write a Java program to create a String object with a character array.
package String.com;
import java.util.*;



public class UsingCharArray
{
	public static void main(String[] args) 
	{
		 // Create a Scanner object for user input
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter the characters: ");
        String input = xyz.nextLine();
     // Convert the string to a character array
        char[] charArray = input.toCharArray();
     // Create a new string from the character array
        String str = new String(charArray);
     // Display the string created from the character array
        System.out.println("String created from character array: " + str);

	}

}

/* dry run test 
 Enter the characters: Hello
 String created from character array: Hello
 */