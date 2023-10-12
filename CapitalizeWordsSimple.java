//Write a java program to capitalize each word in string.

import java.util.Scanner;

public class CapitalizeWordsSimple 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Capitalize each letter in each word in the input string
        String capitalized = capitalizeEachLetter(input);

        // Display the capitalized string
        System.out.println("Capitalized string: " + capitalized);

    }

    // Method to capitalize each letter in each word in a string
    public static String capitalizeEachLetter(String str) 
	{
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        // Loop through each character in the input string
        for (char c : str.toCharArray())
		{
            if (Character.isWhitespace(c)) 
			{
                // If it's a space, set the flag to capitalize the next character
                capitalizeNext = true;
                result.append(c); // Add the space to the result
            } else {
                // Capitalize the character and turn off the flag
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            }
        }

        return result.toString();
    }
}



