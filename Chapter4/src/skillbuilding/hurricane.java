
package skillbuilding;

import java.util.Scanner;

public class hurricane {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number to display the category");
	int category = input.nextInt();
	input.close();
	switch(category)
	{
	case 1:System.out.println("Category1:74-95mph or 64-82kt or 119-153km/hr");break;
	case 2:System.out.println("Category2:96-110mph or 83-95kt or 154-177km/kr");break;
	case 3:System.out.println("Category3:111-130mph or 96-113kt or 178-209km/hr");break;
	case 4:System.out.println("Category4:131-155mgh or 114-135kt or 210-249km/kr");break;
	case 5:System.out.println("Category5:greater than 155mgh or 135kt or 249km/kr");break;
	}
	
	}
}
