/*
 * program name:spending.java    Last date of this revision:September 25,2023
 * 
 * Purpose:An application that generate the percent of each session take part in the total cost 
 * follow by user input.
 * 
 * Author:Terry Pan
 * School:CHHS
 * Course name:Computer Science 20
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
	double food = input.nextInt();
	total += food;
	System.out.println("Clothing: ");
	double clothing = input.nextInt();
	total += clothing;
	System.out.println("Entertainment: ");
	double entertainment = input.nextInt();
	total += entertainment;
	System.out.println("Rent:");
	double rent = input.nextInt();
	total += rent;
	double budgetfood = food / total;
	double budgetclothing = clothing / total;
	double budgetentertainment = entertainment / total;
	double budgetrent = rent / total;
    input.close();
    NumberFormat percent = NumberFormat.getPercentInstance();
    System.out.println("The Budget of food is: " + percent.format(budgetfood));
    System.out.println("The Budget of clothing is: " + percent.format(budgetclothing));
    System.out.println("The Budget of entertainment is: " + percent.format(budgetentertainment));
    System.out.println("The Budget of rent is: " + percent.format(budgetrent));

	}

}

/*Screen Dump
 * Enter the amount spent last month on the following items: 
Food:
350
Clothing: 
300
Entertainment: 
200
Rent:
1250
The Budget of food is: 17%
The Budget of clothing is: 14%
The Budget of entertainment is: 10%
The Budget of rent is: 60%

 */


