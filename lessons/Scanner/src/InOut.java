import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = a + b;
		scanner.close();
		System.out.println(a + " + " + b + " = " + c);
		
	}
}