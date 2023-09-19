package skillbuilding;

import java.util.Scanner;

public class rectangleperimeter 
{

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first segment distance: ");
    double segment1 = input.nextDouble();
	System.out.println("Enter the second segment distance: ");
	double segment2 = input.nextDouble();
	System.out.println("Enter the third segment distance: ");
	double segment3 = input.nextDouble();
	input.close();
	double totaldistance = segment1 + segment2 + segment3;
	System.out.println("The total distance of the race is: " + totaldistance);
	}
	}
