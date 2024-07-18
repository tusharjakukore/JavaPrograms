//Write a Java program to get the character at the given index within the string.
package String.com;
import java.util.*;



public class FindCharacterUsingIndex 
{
	public static void main(String[] args) 
	{
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = xyz.nextLine();

        System.out.print("Enter the index: ");
        int index = xyz.nextInt();
        // Check if the index is within the valid range
        if (index >= 0 && index < inputString.length())
        {
        	// Get the character at the specified index
            
            char characterAtIndex = inputString.charAt(index);
         // Display the character at the specified index
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } 
        else 
        {
            System.out.println("Not found! Please enter valid index");
        }

	}

}

/*
 * dry run test
 * Enter a string: Hello World
   Enter the index: 6
   Character at index 6: W
 */