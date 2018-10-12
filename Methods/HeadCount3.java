import java.util.Scanner;

public class HeadCount3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;

		//initialize another to 1 so loop runs the first time
		int another = 1;
		int counter =1;

		while(another == 1) {
			System.out.println("Enter your name");
			name = scan.nextLine();

			//check for the "secret" name
			if (name.equals("Gigi")) {
				System.out.println("No more attendees allowed");
				//exit the loop
				break;
			}

			System.out.print("Welcome, " + name + ".  ");
			System.out.println("You are attendee " + counter);

			//increase counter for the next name
			counter = counter + 1; //or counter++

			//prompt for whether to continue
			System.out.println("Enter another name? yes = 1");
			another = scan.nextInt();
			
			//a blank nextLine is essential here
			//so the scanner can read the next name
			scan.nextLine();
		}

		scan.close();
	}

}