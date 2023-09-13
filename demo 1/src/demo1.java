import java.util.Scanner;

public class demo1
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("What is num1:\n");
	double num1 = input.nextDouble();
	System.out.print("What is num2: ");
	double num2 = input.nextDouble();
	input.close();
	double num3 = num1 + num2;
	System.out.println("The result of num1 and num2 is: " + num3);
	}
	
}