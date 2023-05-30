import java.time.LocalDate;

class Person {
	enum Sex {
		MALE("Male"),
		FEMALE("Female"),
		OTHER("Other");
		
		private final String asString;
		
		Sex (String asString) {
			this.asString = asString;
			
		}
		
		@Override
		public String toString() {
			return asString;
			
		}
		
	}
	
	String name;
	LocalDate birthday;
	Sex gender;
	String email;
	
	Person() {
		this("Someone", LocalDate.of(2000, 1, 1), Sex.OTHER, "someone@gmail.com");
		
	}
	
	Person(String name, LocalDate birthday, Sex gender, String email) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		
	}
	
	int getAge() {
		if (birthday.isBefore(LocalDate.now())) {
			if (birthday.getDayOfYear()<= LocalDate.now().getDayOfYear())
				return LocalDate.now().getYear()-birthday.getYear();
			
			return LocalDate.now().getYear()-birthday.getYear()-1;
			
		}
		
		return -1;
		
	}
	
	void printPerson() {
		System.out.println(
				"Name: " + name +
				"\nBirthday: " + birthday.toString() +
				"\nGender: " + gender.toString() +
				"\nEmail: " + email +
				"\n");
		
	}
	
}
