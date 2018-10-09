import java.util.Scanner;

public class JavaCamp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userName;
		int userNumber;
		String userInput;

		System.out.println("Hello, Whats your name?");
		userName = scan.nextLine();
		System.out.println("Nice to meet you " + userName + "!");

		System.out.println("Please enter a number between 1 - 100");
		userNumber = scan.nextInt();
		if (userNumber > 0 && userNumber <= 100) {

		} else {
			System.out.println("Enter a different number between 1-100.");
		}
		if ((userNumber % 2 != 0 && userNumber < 100 &&  userNumber < 60)) {
			System.out.println(  userNumber + " is a odd number ");
		} else if ((userNumber % 2 == 0 && userNumber > 2 && userNumber < 25)) {
			System.out.println(userNumber + " is even and less than 25");
		} else if ((userNumber % 2 == 0 && userNumber >= 26 && userNumber <= 60)) {
			System.out.println(userNumber + " is  a even number");
		} else if ((userNumber % 2 == 0 && userNumber > 60)) {
			System.out.println(userNumber + " is a even number");
		} else if ((userNumber % 2 != 0 && userNumber > 60 && userNumber < 100)) {
			System.out.println(userNumber + " is a odd number and over 60");
		}
		System.out.println("Enter Y or Yes to continue press any key to end " );
		userInput = scan.next();
		if (userInput.equalsIgnoreCase("N")) {
			System.out.println("Goodbye " + userName);
		}
		while (userInput.equalsIgnoreCase(("Y")) || userInput.equalsIgnoreCase(("Yes"))) {
			System.out.println("Please enter a number between 1 - 100");
			userNumber = scan.nextInt();

			if (userNumber > 0 && userNumber <= 100) {

			} else {
				System.out.println("Enter a different number between 1-100.");
			}
			if ((userNumber % 2 != 0 && userNumber < 100 && userNumber < 60)) {
				System.out.println(userNumber + " is a odd number ");
			} else if ((userNumber % 2 == 0 && userNumber > 2 && userNumber < 25)) {
				System.out.println(userNumber + " is even and less than 25");
			} else if ((userNumber % 2 == 0 && userNumber >= 26 && userNumber <= 60)) {
				System.out.println(userNumber + " is  a even number");
			} else if ((userNumber % 2 == 0 && userNumber > 60)) {
				System.out.println(userNumber + " is a even number");
			} else if ((userNumber % 2 != 0 && userNumber > 60 && userNumber < 100)) {
				System.out.println(userNumber + " is a odd number and over 60");
			}
			System.out.println("Enter Y or Yes to continue press any key to end ");
			userInput = scan.next();
			if (userInput.equalsIgnoreCase("N")) {
				System.out.println("Goodbye " + userName);
			}

		}

	}

}
