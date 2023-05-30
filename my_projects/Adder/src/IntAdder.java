
public class IntAdder {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Error: not enought arguments!");
			return;
		};
		
		
		int sum = 0;
		
		for (String str : args)
			sum += Integer.valueOf(str);
		
		System.out.println("Sum of args: " + sum);

	}

}
