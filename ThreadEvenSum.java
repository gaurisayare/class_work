/*Write a program that prompts the user to enter a series of integers. 
The program should calculate the sum of all the even numbers entered, skipping any negative numbers. 
Use the continue statement to skip negative numbers.*/

import java.util.Scanner;

class EvenSumCalculator implements Runnable 
{
    private int sum = 0;
    private Scanner scanner;

    public EvenSumCalculator(Scanner scanner) 
	{
        this.scanner = scanner;
    }

    @Override
    public void run() 
	{
        System.out.println("Enter a series of integers. Enter a non-integer to stop.");
        while (true) 
		{
            if (scanner.hasNextInt()) 
			{
                int number = scanner.nextInt();
                if (number < 0) 
				{
                    System.out.println("Skipping negative number: " + number);
                    continue;
                }
                if (number % 2 == 0) 
				{
                    sum = sum + number;
                }
            } 
			else 
			{
                break;
            }
        }
        System.out.println("Sum of even numbers (skipping negatives): " + sum);
    }
}

public class ThreadEvenSum 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        EvenSumCalculator evenSumCalculator = new EvenSumCalculator(scanner);
        Thread thread = new Thread(evenSumCalculator);
        thread.start();

        try 
		{
            thread.join();
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }

        scanner.close();
    }
}