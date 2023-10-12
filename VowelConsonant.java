//WAP to aacept Character from user and make a decision whether it is vowel or consonant

import java.util.Scanner;
class VowelConsonant
{
	public static void main(String args[])
	{  		
		char vowel;            //initialization 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any alphabet to check it is vowel or consonant: ");     
		vowel= sc.next().charAt(0);        //it is used to get character at Zeroth position
		
		switch(vowel) 
		{
			case 'a':
				System.out.println("a is a vowel");
				break;
			
			case 'e':
				System.out.println("e is a vowel");
				break;
				
			case 'i':
				System.out.println("i is a vowel");
				break;
			
			case 'o':
				System.out.println("o is a vowel");
				break;
			
			case 'u':
				System.out.println("u is a vowel");
				break;
		    
			case 'A':
				System.out.println("a is a vowel");
				break;
			
			case 'E':
				System.out.println("e is a vowel");
				break;
				
			case 'I':
				System.out.println("i is a vowel");
				break;
			
			case 'O':
				System.out.println("o is a vowel");
				break;
			
			case 'U':
				System.out.println("u is a vowel");
				break;
				
		    default:
				System.out.println("It is a Consonant");
				break;
		}
		
	}
}