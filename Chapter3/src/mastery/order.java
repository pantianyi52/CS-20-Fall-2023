/*
 * program:order.java    Last date of this revision: September 20,2023
 * 
 * Purpose: An order application that prompts the employee for the number of burger,fries,and soda.
 * Also,display the total,tax,and change.
 * 
 * Author:Terry Pan
 * School:CHHS
 * Course:Computer Science 20
 */


package mastery;

import java.text.NumberFormat;
import java.util.Scanner;

public class order {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double burgers = 1.69;
	double fries = 1.09;
	double sodas = 0.99;
	System.out.println("Enter the number of burger: ");
	int num1 = input.nextInt();
	System.out.println("Enter the number of fries: ");
	int num2 = input.nextInt();
	System.out.println("Enter the number of soda: ");
	int num3 = input.nextInt();
	double total = burgers*num1 + fries*num2 + sodas*num3;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	System.out.println("Total before tax: " + money.format(total));
	double tax = total*0.065;
	System.out.println("Tax: " + money.format(tax));
	total += tax;
	System.out.println("Final total: " + money.format(total));
	System.out.println("Enter amount tendered:");
	double tendered = input.nextDouble();
	input.close();
	System.out.println("Enter amount tendered: " + money.format(tendered));
	double change = tendered - total;
	System.out.println("Change:" + money.format(change));
	
	}

}

/*Screen Dump
Enter the number of burger: 
2
Enter the number of fries: 
5
Enter the number of soda: 
5
Total before tax: $13.78
Tax: $0.90
Final total: $14.68
Enter amount tendered:
20
Enter amount tendered: $20.00
Change:$5.32

 */ 
