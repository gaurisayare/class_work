//WAP to create two thread, one thread will generate even numbers between 1 and 50 
//and another thread will generate odd numbers between 1 to 50.

class EvenThread extends Thread 
{
    public void run() 
	{
        for (int i = 2; i <= 50; i += 2) 
		{
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread 
{
    public void run() 
	{
        for (int i = 1; i <= 50; i += 2) 
		{
            System.out.println("Odd: " + i);
        }
    }
}

public class ThreadDemo1
{
    public static void main(String[] args) 
	{
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        
        evenThread.start();
        oddThread.start();
    }
}
