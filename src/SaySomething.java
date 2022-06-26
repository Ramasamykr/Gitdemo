import java.util.Scanner;

public class SaySomething {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String word = sc.nextLine();
		
		System.out.println("Welcome to git..."+word);
	}

}
