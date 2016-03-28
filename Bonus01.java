import java.util.Scanner;

public class Bonus01 {
	/*
	 * Lennon Turner Java Bootcamp Bonus Lab 01.
	 * 
	 * Creates a program that converts a number grade to it's appropriate letter
	 * grade. program also contains a do-while loop that prompts the user to
	 * continue if they type the letter "Y" when prompted.
	 *
	 * copies grading rubric from the following source:
	 * http://www.colostate.edu/Dept/EdLicense/StudentTeaching/grade_scale.pdf
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	// Function gradeCalc takes as input an integer representing a numerical
	// grade, and then proceeds to go through multiple if-else statements to
	// check for the appropriate letter grade.
	public static String gradeCalc(int grade) {
		if (grade > 97) {
			return "A+";
		} else if ((grade < 97) && (grade >= 93)) {
			return "A";
		} else if ((grade < 93) && (grade >= 90)) {
			return "A-";
		} else if ((grade < 90) && (grade >= 87)) {
			return "B+";
		} else if ((grade < 87) && (grade >= 83)) {
			return "B";
		} else if ((grade < 83) && (grade >= 80)) {
			return "B-";
		} else if ((grade < 80) && (grade >= 77)) {
			return "C+";
		} else if ((grade < 77) && (grade >= 73)) {
			return "C";
		} else if ((grade < 73) && (grade >= 70)) {
			return "C-";
		} else if ((grade < 70) && (grade >= 67)) {
			return "D+";
		} else if ((grade < 67) && (grade >= 63)) {
			return "D";
		} else if ((grade < 63) && (grade >= 60)) {
			return "D-";
		} else if ((grade < 60) && (grade >= 0)) {
			return "F";
		}
		// if a number less than 0 is entered, the program will tell the user
		// that the input is invalid, and recall the function with a new input.
		else {
			Scanner input = new Scanner(System.in);
			System.out.print("Invalid entry. Please enter another value: ");
			int newGrade = input.nextInt();
			input.close();
			return gradeCalc(newGrade);
		}

	}

	public static void main(String[] args) {
		// sets up the input system.
		Scanner grade = new Scanner(System.in);
		Scanner answer = new Scanner(System.in);
		char newAnswer;

		System.out.println("Welcome to the Letter Grade Converter");
		// do while loop containing the conversion, and continuing if the user
		// types "Y" when prompted.
		do {
			System.out.print("\nEnter a numerical grade: ");
			int newGrade = grade.nextInt();
			System.out.println("Letter Grade: " + gradeCalc(newGrade));
			System.out.print("\n" + "Continue? (Y/N): ");
			newAnswer = answer.next(".").charAt(0);

		} while ((Character.toUpperCase(newAnswer)) == 'Y');
		grade.close();
		answer.close();

	}

}
