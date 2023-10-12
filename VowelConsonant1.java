import java.util.Scanner;
class VowelConsonant1                               
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
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
		    case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(vowel+" is a vowel");
				break;
				
		    default:
				System.out.println(vowel+" is a Consonant");
				break;
		}
		
	}
}