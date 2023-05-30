
public class PhoneNumberValidation {

	final static String REGEX = "[^0-9]";
	
	static void validatePhoneNumbers (String[] phoneNumbers) {
		final int length = 9;
		
		class PhoneNumber {
			
			String phoneNumber;
			
			public PhoneNumber(String phoneNumber) {
				String currentNumber = phoneNumber.replaceAll(REGEX, "");
				
				this.phoneNumber = currentNumber.length() == length ? currentNumber : null;
				
			}
			
			public String getNumber() {
				return phoneNumber;
				
			}
			
			public void printOriginalNumber(int i) {
					System.out.println("Original phone number: " + phoneNumbers[i]);
				
			}
			
		}
		
		
		
		for (int i = 0; i < phoneNumbers.length; i++) {
			PhoneNumber n = new PhoneNumber(phoneNumbers[i]);
			n.printOriginalNumber(i);
			if (n.getNumber() == null)
				System.out.println("Invalid phone number!");
			else 
				System.out.println("Cutted number: " + n.getNumber());
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		String[] str = new String[] 
				{
					"123-123-123",
					"555-5555",
					"8-800-555-3535",
					"456-789-382",
					"111-1111",
					"98-00-78-560"
				};
		validatePhoneNumbers(str);

	}

}
