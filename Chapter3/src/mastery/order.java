/*
 * program:order.java    Last date of this revision: September 20,2023
 * 
 * Purpose: An application that allow 
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
	input.close();
	double total = burgers*num1 + fries*num2 + sodas*num3;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	System.out.println("Total before tax: " + money.format(total));
	double tax = total*0.065;
	System.out.println("Tax: " + money.format(tax));
	total += tax;
	System.out.println("Final total: " + money.format(total));

	}

}

/*Screen Dump
 * Enter the number of burger: 
56
Enter the number of fries: 
23
Enter the number of soda: 
13
Total before tax: $132.58
Tax: $8.62
Final total: $141.20

 */ 
