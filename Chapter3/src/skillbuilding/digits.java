package skillbuilding;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please give me a two-digit number: ");
	int number = input.nextInt();
	input.close();
	int result = number / 10;
	int tensplace = result*10;
	int onesplace = number - tensplace;
	System.out.println("The tens-place digits is: \n" + tensplace);
	System.out.println("The ones-place digits is: \n" + onesplace);
	
	}

}
