import java.util.Locale;

public class FloatAdder {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Error: not enought arguments!");
			return;
		};
		
		
		float sum = 0;
		
		for (String str : args)
			sum += Float.valueOf(str);
		
		System.out.format(Locale.getDefault(), "Sum of args: %.2f", sum);

	}

}
