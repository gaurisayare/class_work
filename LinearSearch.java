/*Write a java Program to accept array of integer with size 10.
Take data from user and ask user to search an element and find whether that element is
present in the given array or not. If present then mention index number as well.
Using Linear Search

Algorithm for linear search:

public class LinearSearch 
{
    public static int linearSearch(int[] array, int target) 
	{
        for (int i = 0; i < array.length; i++) 
		{
            if (array[i] == target) 
			{
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}*/

import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args) 
	{
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for the array
        for (int i = 0; i < 10; i++) 
		{
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sorting the array 
        for (int i = 0; i < 9; i++) 
		{
            for (int j = 0; j < 9 - i; j++) 
			{
                if (array[j] > array[j + 1]) 
				{
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Asking user to search for an element
        System.out.print("Enter the element you want to search for: ");
        int searchElement = scanner.nextInt();

        // Performing linear search
        int index = -1;
        for (int i = 0; i < 10; i++) 
		{
            if (array[i] == searchElement) 
			{
                index = i;
                break;
            }
        }

        if (index != -1) 
		{
            System.out.println("The element " + searchElement + " is present at index " + index + ".");
        } 
		else 
		{
            System.out.println("The element " + searchElement + " is not present in the array.");
        }

    }
}