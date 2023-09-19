package skillbuilding;

import java.text.NumberFormat;
import java.util.Scanner;

public class gradeavg2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grade = 0;
		System.out.println("Please enter the first grade: ");
		int grade1 = input.nextInt();
		grade += grade1;
		System.out.println("Please enter the second grade: ");
		int grade2 = input.nextInt();
		grade += grade2;
		System.out.println("Please enter the third grade: ");
		int grade3 = input.nextInt();
		grade += grade3;
		System.out.println("please enter the fourth grade: ");
		int grade4 = input.nextInt();
		grade += grade4;
		System.out.println("please enter the fifth grade: ");
		int grade5 = input.nextInt();
		grade += grade5;
		input.close();
	    grade /= 500;
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("The average percent is: " + percent.format(grade));
        
	}

}
