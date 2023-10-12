/*WAP to search given student name is available in the list of student name using String array.*/

import java.util.Scanner;

public class StudentSearch 
{
    public static void main(String[] args) 
	{
        // Array of student names
        String[] studentNames = {
            "John",
            "Alice",
            "Bob",
            "Emily",
            "Michael"
        };

        // Create a Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the student name to search for
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine(); 					// Read the input

        boolean found = false;       // Flag to track if the name is found
        
        // Loop through each name in the array
        for (String name : studentNames) 
		{
            if (name.equalsIgnoreCase(searchName))   // Case-insensitive comparison
			{ 
                found = true; // Set the flag to true if the name is found
                break; // Exit the loop since the name was found
            }
        }

        // Check if the name was found and display appropriate message
        if (found) 
		{
            System.out.println("Student name \"" + searchName + "\" found in the list.");
        }
		else 
		{
            System.out.println("Student name \"" + searchName + "\" not found in the list.");
        }

        
    }
}
