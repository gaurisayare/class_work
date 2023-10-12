/*Write a java Program to accept array of integer with size 10.
Take data from user and ask user to search an element and find whether that element is
present in the given array or not. If present then mention index number as well.
Using Binary Search

Algorithm For Binary Search:
public class BinarySearch 
{
    public static int binarySearch(int[] array, int target) 
	{
        int left = 0;
        int right = array.length - 1;

        while (left <= right) 
		{
            int mid = left + (right - left) / 2;

            if (array[mid] == target) 
			{
                return mid; // Return the index where the target is found
            }

            if (array[mid] < target) 
			{
                left = mid + 1;
            } 
			else 
			{
                right = mid - 1;
            }
        }

        return -1; // Return -1 if target is not found
    }
} */

import java.util.Scanner;

public class BinarySearch 
{
    public static void main(String[] args) 
	{
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the array
        for (int i = 0; i < 10; i++) 
		{
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        //Sorting
        boolean swapped;
        for (int i = 0; i < 9; i++) 
		{
            swapped = false;
            for (int j = 0; j < 9 - i; j++) 
			{
                if (array[j] > array[j + 1]) 
				{
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) 
			{
                break; // If no swaps were made in a pass, array is already sorted
            }
        }


        // Asking user to search for an element
        System.out.print("Enter the element you want to search for: ");
        int searchElement = sc.nextInt();

        // Performing binary search
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) 
		{
            int mid = left + (right - left) / 2;

            if (array[mid] == searchElement) 
			{
                index = mid;
                break;
            } 
			else if (array[mid] < searchElement) 
			{
                left = mid + 1;
            } 
			else 
			{
                right = mid - 1;
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