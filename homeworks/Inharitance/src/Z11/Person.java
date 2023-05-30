package Z11;

import java.time.LocalDate;

abstract public class Person {
	String name;
	String surname;
	LocalDate birthday;
	
	Person() {
		this("Someone", "Someone", LocalDate.of(2000,1,1));
	}
	
	Person(String name, String surname, LocalDate birthday) {
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
	}
	
	public void printPerson() {
		System.out.println("Name: " + name +
						   "\nSurname: " + surname +
						   "\nBirthday: " + birthday);
	}
}
