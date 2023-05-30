
import java.util.Scanner;

public class Z3 {

	public static void main(String[] args) {
		System.out.println("Please write string to check if it is a palidrome:");
		Scanner sc = new Scanner(System.in);
		String origString = sc.nextLine();
		sc.close();
		String str = cutJunk(origString.toLowerCase());
		
		boolean isPalindrom = true;
		int length = str.length()-1, i = 0;
		
		while (i < length) {
			if (str.charAt(i) != str.charAt(length)) {
				isPalindrom = false;
				break;
				
			}
			i++;
			length--;
			
		}
		
		System.out.println("String \"" + origString +"\" is palidrome: " + isPalindrom);

	}
	
	private static String cutJunk(String str) {
		return str.replaceAll("[^a-zA-Z0-9]", "");
		
	}

}
