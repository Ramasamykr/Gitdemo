import java.util.InputMismatchException;
import java.util.Scanner;

public class Showdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the day name, we will show the current day number");
		Scanner input = new Scanner(System.in);
		
		String dayname = "";

		try
		{
			dayname = input.nextLine();
			System.out.println("dayname---->"+dayname);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please type String");
		}
		
		switch (dayname) {
		
		case ("monday"):
			System.out.println("DayNumber------>"+1);
			break;
		case ("tuesday"):
			System.out.println("DayNumber------>"+2);
			break;
		case ("wednesday"):
			System.out.println("DayNumber------>"+3);
			break;
		case ("thrusaday"):
			System.out.println("DayNumber------>"+4);
			break;
		case ("friday"):
			System.out.println("DayNumber------>"+5);
			break;
		case ("saturday"):
			System.out.println("DayNumber------>"+6);
			break;
		case ("sunday"):
			System.out.println("DayNumber------>"+7);
			break;
		default:
			System.out.println("Defaut statement");
			break;
		}
	}

}
