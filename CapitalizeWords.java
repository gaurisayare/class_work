import java.util.Scanner;

public class CapitalizeWords 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Capitalize each word in the input string
        String capitalized = capitalizeWords(input);

        // Display the capitalized string
        System.out.println("Capitalized string: " + capitalized);

    }

    // Method to capitalize each word in a string
    public static String capitalizeWords(String str) 
	{
        // Split the input string into words using space as the delimiter
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) 
		{
            if (!word.isEmpty()) 
			{
                // Capitalize the first character of the word and append the rest
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
                result.append(" "); // Add a space after each capitalized word
            }
        }

        // Remove the trailing space and return the capitalized string
        return result.toString().trim();
    }
}
