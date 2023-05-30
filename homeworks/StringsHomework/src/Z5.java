
import java.util.Scanner;

public class Z5 {

	public static void main(String[] args) {
		System.out.println("Please, write your arithmetic expression: ");
		Scanner sc = new Scanner(System.in);
		String arExpression = sc.nextLine();
		sc.close();
		
		int counter = 0, length = arExpression.length();
		
		for (int i = 0; i < length; i++) {
			char ch = arExpression.charAt(i);
			
			if (ch == '(')
				counter++;
			if (ch == ')')
				counter--;
			
		}
		
		String result;
		
		if (counter == 0)
			result = "all right";
		else if (counter > 0)
			result = "not enough \')\' were found";
		else
			result = "not enough \'(\' were found";
		
		System.out.println("Check result: " + result);

	}

}
