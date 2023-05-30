
public class Anagram {

	public static void main(String[] args) {
		String str1 = "Softw40, 123ear";
		String str2 = "Swear{} 2104.3 oft";
		
		System.out.println("Is " + str1 + " anagram of " + str2 + ": " + isAnagram(str1, str2));

	}

	public static boolean isAnagram(String str1, String str2) {
		str1 = cleanFromJunk(str1);
		str2 = cleanFromJunk(str2);
		
		return str1.equalsIgnoreCase(str2);
		
	}
	
	private static String cleanFromJunk (String str) {
		final String REGEX = "[^a-zA-z_0-9]";
		
		System.out.println("str before cleaning: " + str);
		str = str.replaceAll(REGEX, "").toLowerCase();
		str = sort(str);
		System.out.println("str after cleaning: " + str + "\n");
		
		return str;
		
	}
	
	private static String sort (String str) {
		char[] chArr = str.toCharArray();
		java.util.Arrays.sort(chArr);
		
		return new String(chArr);
	
	}

}
