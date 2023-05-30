
import java.util.Scanner;

public class Z1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, write your string to count how many times the last character apears in it:");
		String str = sc.nextLine();
		sc.close();
		
		int length = str.length();
		char aimChar = str.charAt(length-1);
		
		System.out.println("The last character in string \"" + str + "\" is '" + aimChar +"'");
		
		int result = 0;
		for (int i = 0; i<length; i++)
			if (str.charAt(i) == aimChar)
				result++;
		
		System.out.println("Character '" + aimChar + "' appears in string \"" + str + "\" " + result + " times");
		
	}

}
