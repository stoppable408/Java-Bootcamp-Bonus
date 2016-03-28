import java.util.Scanner;

public class Bonus01 {

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
		else {
			Scanner input = new Scanner(System.in);
			int newGrade;
			do {
			
				System.out.print("Invalid entry. Please enter another value: ");
				newGrade = input.nextInt();
			
			} while (grade < 0);
			input.close();
			return gradeCalc(newGrade);
		}

	}

	public static void main(String[] args) {
		
		Scanner grade = new Scanner(System.in);
		Scanner answer = new Scanner(System.in);
		String newAnswer;

		System.out.println("Welcome to the Letter Grade Converter");
		
		
		do {
			System.out.print("\nEnter a numerical grade: ");
			int newGrade = grade.nextInt();
			System.out.println("Letter Grade: " + gradeCalc(newGrade));
			System.out.print("\n" + "Continue? (y/n): ");
			newAnswer = answer.next();

		} while (newAnswer.equalsIgnoreCase("Y"));
		grade.close();
		answer.close();

	}

}
