
import java.util.Scanner;

public class Z4 {

	public static void main(String[] args) {
		/* version 1
		System.out.println("Please, write string, to sum all numbers in it:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int sum = 0, length = str.length();
		
		for (int i = 0; i < length ; i++) {
			Character ch = str.charAt(i);
			if (Character.isDigit(ch))
				sum += Integer.valueOf(ch.toString());
			
		}
		
		System.out.println("The of all numbers in string \"" + str +"\" is: " + sum);
		*/
		
		// version 2
		System.out.println("Please, write string, to sum all numbers in it:");
		Scanner sc = new Scanner(System.in);
		String originalString = sc.nextLine();
		sc.close();
		
		String cuttedString = leaveOnlyNumbers(originalString);
		int sum = 0, length = cuttedString.length();
		
		for (int i = 0; i<length; i++)
			sum += Integer.valueOf(Character.toString(cuttedString.charAt(i)));
		
		System.out.println("The of all numbers in string \"" + originalString +"\" is: " + sum);
		
	}
	
	private static String leaveOnlyNumbers(String str) {
		return str.replaceAll("[^0-9]", "");
		
	}

}
