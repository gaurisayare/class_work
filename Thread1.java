/*WAP to check whether the number is even or odd using thread*/


import java.util.Scanner;

class NumberChecker implements Runnable 
{
    private int number;

    public NumberChecker(int number) 
	{
        this.number = number;
    }

    @Override
    public void run() 
	{
        if (number % 2 == 0) 
		{
            System.out.println(number + " is even.");
        } 
		else 
		{
            System.out.println(number + " is odd.");
        }
    }
}

public class Thread1 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        NumberChecker numberChecker = new NumberChecker(number);
        Thread thread = new Thread(numberChecker);
        thread.start();

        scanner.close();
    }
}