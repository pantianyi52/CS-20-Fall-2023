package skillbuilding;

import java.text.NumberFormat;
import java.util.Scanner;

public class gradeavg2 {

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
		int result = grade1 + grade2 + grade3 + grade4 + grade5;
		result /= 5;
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("The average percent is" + percent.format(result));
        
	}

}
