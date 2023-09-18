package skillbuilding;

import java.util.Scanner;

public class gradeavg1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the first grade: ");
	int grade1 = input.nextInt();
	System.out.println("Please enter the second grade: ");
	int grade2 = input.nextInt();
	System.out.println("Please enter the third grade: ");
	int grade3 = input.nextInt();
	System.out.println("please enter the fourth grade: ");
	int grade4 = input.nextInt();
	System.out.println("please enter the fifth grade: ");
	int grade5 = input.nextInt();
	input.close();
	int gradetotal = grade1 + grade2 + grade3 + grade4 + grade5;
	int gradeavg = gradetotal / 5;
	System.out.println("The average grade is:" + gradeavg);
	}

}
