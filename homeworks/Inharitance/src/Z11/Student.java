package Z11;

import java.time.LocalDate;

public class Student extends Person {
	static int studentsAmount = 0;
	
	int year;
	String group;
	int id;
	
	Student() {
		super();
		year = 1;
		setGroupAndId();	
	}
	
	Student(String name, String surname, LocalDate birthday) {
		super(name, surname, birthday);
		year = 1;
		setGroupAndId();
	}
	
	Student(String name, String surname, LocalDate birthday, int year) {
		super(name, surname, birthday);
		this.year = year;
		setGroupAndId();
	}
	
	private void setGroupAndId() {
		studentsAmount++;
		group = "G" + (studentsAmount/50 + 1);
		id = studentsAmount;
	}
	
	@Override
	public void printPerson() {
		super.printPerson();
		System.out.println("Year: " + year +
						   "\nGroup: " + group +
						   "\nId: " + id);
	}
}
