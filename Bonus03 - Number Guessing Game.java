import java.util.Scanner;

public class Bonus03 {

	public static int getNum(Scanner input) {
		int number;
		while (!input.hasNextInt()) {
			System.out.print("Invalid Entry. Must be a number: ");
			input.nextLine();
		}
		number = input.nextInt();
		return number;
	}

	public static int guess(int guess, int number, Scanner input) {

		int attempts = 0;
		if (guess == number)
			attempts++;
		while (guess != number) {
			attempts++;
			if (guess >= (number + 10)) {
				System.out.println("your number is much too high");

			} else if (guess <= (number - 10)) {
				System.out.println("your number is much too low");

			} else if (guess > number) {
				System.out.println("close but you are too high");

			} else if (guess < number) {
				System.out.println("close but you are too low");

			}
			System.out.println("Please try again: ");
			guess = getNum(input);
		}
		while (guess != number)
			;
		return attempts;
	}

	public static void attemptReturn(int attempts) {
		if (attempts == 1) {
			System.out.println("Perfect! You got it in " + attempts + " attempt.");
		} else if (attempts > 1 && attempts <= 5) {
			System.out.println("You did really well! You got it in " + attempts + " attempts.");
		} else if (attempts > 5 && attempts <= 10) {
			System.out.println("You did alright, but you can do better! You got it in " + attempts + " attempts.");
		} else if (attempts > 10 && attempts <= 20) {
			System.out.println("I know you can do better than that! You got it in " + attempts + " attempts.");
		} else {
			System.out.println("you did terribly... You got it in " + attempts + " attempts.");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = ((int) (Math.random() * 100));
		System.out.print("Please Guess a number: ");
		int guess = getNum(input);
		attemptReturn(guess(guess, number, input));

	}

}
