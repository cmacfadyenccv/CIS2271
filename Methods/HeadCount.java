import java.util.Scanner;

public class HeadCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		for(int counter = 1; counter < 6; counter = counter + 1) {
			System.out.println("Enter your name");
			name = scan.nextLine();
			
			System.out.print("Welcome, " + name + ".  ");
			System.out.println("You are attendee " + counter);
		}
	}
}
