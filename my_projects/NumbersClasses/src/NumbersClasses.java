
public class NumbersClasses {

	public static void main(String[] args) {
		
		System.out.println("Integer.parseInt(\"222\", 3): " + Integer.parseInt("222", 3));
		
		Integer var = Integer.valueOf("222", 3);
		System.out.println("Integer var = Integer.valueOf(\"222\", 3): " + var);
		
		System.out.println("var.compareTo(25): " + var.compareTo(25));
		
		System.out.println("var.compareTo(28): " + var.compareTo(28));
		
		System.out.println("var.equals(26): " + var.equals(26));
		
		System.out.println("var.doubleValue(): " + var.doubleValue());
		
		System.out.println("Integer.decode(\"0xA\"): " + Integer.decode("0xA"));
		System.out.println("Integer.decode(\"017\"): " + Integer.decode("017"));

	}

}
