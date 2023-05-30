
public class ComputeInitials {

	public static void main(String[] args) {
		// version 1
		String name = "John";
		String surname = "Doe";
		
		System.out.println("My initials are: " + name.charAt(0) + "." + surname.charAt(0) + ".");
		
		//version 2
		String myName = "John Doe";
        StringBuilder myInitials = new StringBuilder();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
                myInitials.append('.');
            
            }
        }
        System.out.println("My initials are: " + myInitials);

	}

}
