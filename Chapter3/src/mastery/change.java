package mastery;

import java.util.Scanner;

public class change {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the change in cents: ");
	int change = input.nextInt();
	input.close();
	int quarters = change/25;
	int remainder = change%25;
	int dimes = remainder/10;
	int remainder1 = remainder%10;
	int nickels = remainder1/5;
	int remainder2 = remainder1%5;
	int pennies = remainder2/1;
	System.out.println("The minimum number of coins is: ");
	System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
	}

}
