
import java.util.Scanner;

public class Z2 {

	public static void main(String[] args) {
		System.out.println("Please, write string to reverse it:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Reversed string \"" + str + "\": " + sb.reverse());

	}

}
