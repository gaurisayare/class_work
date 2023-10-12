import java.util.Scanner;
class IfVowelConso
{
	public static void main(String args[])
	{  		
		char vowel;            //initialization 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any alphabet to check it is vowel or consonant: ");     
		vowel= sc.next().charAt(0);        //it is used to get character at Zeroth position
		
		if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U')
			System.out.println(vowel+" is a Vowel!!");
			
		else
		    System.out.println(vowel+" is a Consonant..");
	}
}