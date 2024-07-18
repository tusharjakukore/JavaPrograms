//Write a Java program to compare a given string to the specified character sequence
package String.com;
import java.util.*;

public class CompareString
{
	public static void main(String[] args) 
	{
		// Create a Scanner object for user input
		Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = xyz.nextLine();

        System.out.print("Enter the character sequence to compare: ");
        String sequence = xyz.nextLine();
     // Check if the input string starts and ends with the specified sequence
        if (inputString.startsWith(sequence) && inputString.endsWith(sequence))
        {
            System.out.println("The string matche specified character sequence at both the beginning and the end.");
        }
        else if (inputString.startsWith(sequence)) 
        {
            System.out.println("The string matches specified character sequence at the beginning.");
        } 
        else if (inputString.endsWith(sequence)) 
        {
            System.out.println("The string matches specified character sequence at the end.");
        }  
        else 
        {
            System.out.println("The string does not match the specified character sequence.");
        }
		

	}

}

/*
 * dry run test
   Enter a string: banana
   Enter the character sequence to compare: ba
   The string matches specified character sequence at the beginning.

   Enter a string: hello
   Enter the character sequence to compare: lo
   The string matches specified character sequence at the end.

   Enter a string: apple
   Enter the character sequence to compare: pear
   The string does not match the specified character sequence.
 */