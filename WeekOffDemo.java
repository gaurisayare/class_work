/*WAP to make decision which day of week is selected by user as week-off.
iT IS USED IN MENU DRIVEN PROGRAMMING
switch(ch)    //user input as a choice
{
	case 1:
		code body;
		break;
	case 2:
		code body;
		break;
	case 3:
		code body;
		break;
	....
	default:
		code body;
		break;
}
*/
import java.util.Scanner;
class WeekOffDemo
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
	switch(ch)
	{
		case 1:
			System.out.println("Your weekly off is MONDAY!!!!");
			break;
		case 2:
			System.out.println("Your weekly off is TUESDAY!!!!");
			break;
		case 3:
			System.out.println("Your weekly off is WEDNESDAY!!!!");
			break;
		case 4:
			System.out.println("Your weekly off is THURSDAY!!!!");
			break;
		case 5:
			System.out.println("Your weekly off is FRIDAY!!!!");
			break;
		case 6:
			System.out.println("Your weekly off is SATURDAY!!!!");
			break;
		case 7:
			System.out.println("Your weekly off is SUNDAY!!!!");
			break;
		default:
			System.out.println("NO Weekly off to you as invalid input");
			break;
	}
	}
}