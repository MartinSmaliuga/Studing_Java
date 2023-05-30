
public class StringCompere {

	public static void main(String[] args) {
		String a = new String("Some String");
		String b = new String("Some String");
		String c = "Some String";
		String d = "Some String";
		
		System.out.println("a == b?");
		if (a == b)
			System.out.println("a == b");
		else
			System.out.println("a != b");
		System.out.println();
		
		System.out.println("a.campareTo(b) == 0?");
		if (a.compareTo(b) == 0)
			System.out.println("a == b");
		else
			System.out.println("a != b");
		System.out.println();
		
		System.out.println("b == c?");
		if (b == c)
			System.out.println("b == c");
		else
			System.out.println("b != c");
		System.out.println();
		
		System.out.println("c == d?");
		if (c == d)
			System.out.println("c == d");
		else
			System.out.println("c != d");
		System.out.println();
	}
}