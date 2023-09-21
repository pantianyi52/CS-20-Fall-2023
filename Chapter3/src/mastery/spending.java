/*
 * 
 */
package mastery;

import java.util.Scanner;
import java.text.NumberFormat;
public class spending {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int total = 0;
	System.out.println("Enter the amount spent last month on the following items: ");
	System.out.println("Food:");
	int food = input.nextInt();
	total += food;
	System.out.println("Clothing: ");
	int clothing = input.nextInt();
	total += clothing;
	System.out.println("Entertainment: ");
	int entertainment = input.nextInt();
	total += entertainment;
	System.out.println("Rent:");
	int rent = input.nextInt();
	total += rent;
	double budgetfood = (food / total)*100;
	double budgetclothing = (clothing / total)*100;
	double budgetentertainment = (entertainment / total)*100;
	double budgetrent = (rent / total)*100;
    input.close();
    NumberFormat percent = NumberFormat.getPercentInstance();
    System.out.println("The Budget of food is" + percent.format(budgetfood));
    System.out.println("The Budget of clothing is" + percent.format(budgetclothing));
    System.out.println("The Budget of entertainment is" + percent.format(budgetentertainment));
    System.out.println("The Budget of rent is" + percent.format(budgetrent));

	}

}

/*Screen Dump
 * 
 */


